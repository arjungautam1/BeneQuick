package bqtest.service;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface MemberImporter {

    /*
    Don't modify this file
     */

    List<Member> importMembers(File inputMemberFile) throws Exception;

}
