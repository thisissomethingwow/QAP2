package com.keyin.domain.members;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.util.Date;

@Entity
public class Member {
    @Id
    @SequenceGenerator(name = "member_sequence", sequenceName = "member_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "member_sequence")
    private long id;

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private boolean membershipTypePremium; //if its = to true the type is Premium
    private Date membershipStartDate;
    private Date membershipEndDate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isMembershipTypePremium() {
        return membershipTypePremium;
    }

    public void setMembershipTypePremium(boolean membershipTypePremium) {
        this.membershipTypePremium = membershipTypePremium;
    }

    public Date getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(Date membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    public Date getMembershipEndDate() {
        return membershipEndDate;
    }

    public void setMembershipEndDate(Date membershipEndDate) {
        this.membershipEndDate = membershipEndDate;
    }

    public Member() { //for ease of testing
    }

    public Member(String name, String address, String email, String phoneNumber, boolean membershipTypePremium, Date membershipStartDate, Date membershipDuration) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.membershipTypePremium = membershipTypePremium;
        this.membershipStartDate = membershipStartDate;
        this.membershipEndDate = membershipDuration;
    }

    public Member(long id, String name, String address, String email, String phoneNumber, boolean membershipTypePremium, Date membershipStartDate, Date membershipDuration) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.membershipTypePremium = membershipTypePremium;
        this.membershipStartDate = membershipStartDate;
        this.membershipEndDate = membershipDuration;
    }
}
