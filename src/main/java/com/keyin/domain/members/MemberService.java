package com.keyin.domain.members;

import com.keyin.domain.tournaments.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    public Member updateMember(long id,Member updatedMember){
        Optional<Member> memberToUpdateOptional = memberRepository.findById(id);
        if (memberToUpdateOptional.isPresent()){
            Member memberToUpdate = memberToUpdateOptional.get();
            memberToUpdate.setName(updatedMember.getName());
            memberToUpdate.setAddress(updatedMember.getAddress());
            memberToUpdate.setEmail(updatedMember.getEmail());
            memberToUpdate.setPhoneNumber(updatedMember.getPhoneNumber());
            memberToUpdate.setPremium(updatedMember.isPremium());
            memberToUpdate.setMembershipStartDate(updatedMember.getMembershipStartDate());
            memberToUpdate.setMembershipEndDate(updatedMember.getMembershipEndDate());
            return memberRepository.save(memberToUpdate);
        }
        return null;
    }




}
