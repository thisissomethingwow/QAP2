package com.keyin.domain.members;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public Member getMemberByName(String name){
        return memberRepository.findByName(name);
    }

    public List<Member> getMemberByIsPremium(boolean isPremium){
        return memberRepository.findByIsPremium(isPremium);
    }

    public List<Member> getMemberByPhoneNumber(String phoneNumber){
        return memberRepository.findByPhoneNumber(phoneNumber);
    }

    public Member getMemberByEmail(String email){
        return memberRepository.findByEmail(email);
    }

    public List<Member> getMemberByMembershipEndDate(Date membershipEndDate){
        return memberRepository.findByMembershipEndDate(membershipEndDate);
    }



}
