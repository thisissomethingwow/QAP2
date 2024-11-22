package com.keyin.domain.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    //get add and search by name memtype phonenum and tournament start date??

    public List<Member> getAllMembers(){return (List<Member>) memberRepository.findAll();}

    public Member addMember(Member member){
        return memberRepository.save(member);
    }
}
