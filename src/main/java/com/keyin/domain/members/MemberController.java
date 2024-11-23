package com.keyin.domain.members;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/members")
@CrossOrigin
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping
    public List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @PostMapping
    public Member addMember(@RequestBody Member member){
        return memberService.addMember(member);
    }

   @GetMapping("/name_search")  //http://localhost:8080/members/member_search?name=name
   public Member getMemberByName(@RequestParam("name") String name){
        return memberService.getMemberByName(name);
   }

//    @GetMapping("/membership_search")
//    public List<Member> getMemberByMembershipType(@RequestParam("membership_type_premium") boolean type){
//        return memberService.getMemberByMembershipType(type);
//    }

    @GetMapping("/phoneNumber_search") //http://localhost:8080/members/member_search?phoneNumber=4444444444
    public List<Member> getMemberByPhoneNumber(@RequestParam("phoneNumber") String phoneNumber){
        return memberService.getMemberByPhoneNumber(phoneNumber);
    }

    @GetMapping("/email_search")
    public Member getMemberByEmail(@RequestParam("email") String email){
        return memberService.getMemberByEmail(email);
    }

    @GetMapping("/endDate_search")
    public List<Member> getMemberByEndDate(@RequestParam("endDate") Date endDate){
        return memberService.getMemberByEndDate(endDate);
    }
}
