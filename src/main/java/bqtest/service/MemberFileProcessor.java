package bqtest.service;

import java.io.File;
import java.util.List;
import java.util.Map;

public abstract class MemberFileProcessor {
	/*
	 * NOTE: Do not modify this class
	 */

	protected abstract MemberImporter getMemberImporter( );

	protected abstract List< Member > getNonDuplicateMembers( List< Member > membersFromFile );

	protected abstract Map< String, List< Member >> splitMembersByState( List< Member > validMembers );

	public Map<String, List<Member>> processFile( File inputMemberFile) throws Exception {

		/*
		 * Read :
		 */
		MemberImporter memberImporter = getMemberImporter( );
		List< Member > membersFromFile = memberImporter.importMembers( inputMemberFile );

		/*
		 * Filter :
		 */

		List< Member > validMembers = getNonDuplicateMembers( membersFromFile );
		return splitMembersByState( validMembers );

	}

}
