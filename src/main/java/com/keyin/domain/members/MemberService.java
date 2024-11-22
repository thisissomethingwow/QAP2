package com.keyin.domain.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    //get add and search by name memtype phonenum and tournament start date??

    public Iterable<Member> getAllMembers(){return memberRepository.findAll();}

    public Member addMember(Member member){
        return memberRepository.save(member);
    }
}
