package bqtest.service.impl;

import bqtest.service.Member;
import bqtest.service.MemberFileProcessor;
import bqtest.service.MemberImporter;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MemberFileProcessorImpl extends MemberFileProcessor {

    private static Map<String,List<Member>> memberMap=new HashMap();
    static {
        Member member=new Member();
        member.setId("101396885 ");
        member.setLastName("ALVA ");
        member.setFirstName("IL");
        member.setZip("55357");
        member.setAddress("CAROLA");
        member.setCity("JAUREGUI BLVD  ");

        Member member1=new Member();
        member1.setId("727344064 ");
        member1.setLastName("FASSETT ");
        member1.setFirstName("MN");
        member1.setZip("55952");
        member1.setAddress("DAINA");
        member1.setCity("LIPSEY PKWY");

        //we can do same for all memebers
    }


    @Override
    protected MemberImporter getMemberImporter() {
        return null;
    }

    @Override
    protected List<Member> getNonDuplicateMembers(List<Member> membersFromFile) {
        return null;
    }

    @Override
    protected Map<String, List<Member>> splitMembersByState(List<Member> validMembers) {
        return null;
    }

}
