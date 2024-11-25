package com.keyin.domain.members;


import com.keyin.domain.tournaments.Tournament;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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

   @GetMapping("/name_search")  //http://localhost:8080/members/name_search?name=name
   public Member getMemberByName(@RequestParam("name") String name){
        return memberService.getMemberByName(name);
   }

    @GetMapping("/membership_search")
    public List<Member> getMemberByIsPremium(@RequestParam("is_premium") boolean isPremium){
        return memberService.getMemberByIsPremium(isPremium);
    }

    @GetMapping("/phoneNumber_search")
    public List<Member> getMemberByPhoneNumber(@RequestParam("phoneNumber") String phoneNumber){
        return memberService.getMemberByPhoneNumber(phoneNumber);
    }

    @GetMapping("/email_search")
    public Member getMemberByEmail(@RequestParam("email") String email){
        return memberService.getMemberByEmail(email);
    }

    @GetMapping("/endDate_search")
    public List<Member> getMemberByMembershipEndDate(@RequestParam("membershipEndDate")@DateTimeFormat(pattern = "yyyy-MM-dd") Date membershipEndDate){
        return memberService.getMemberByMembershipEndDate(membershipEndDate);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Member> updateMember(@PathVariable long id, @RequestBody Member member){
        return ResponseEntity.ok((memberService.updateMember(id,member)));
    }




}
