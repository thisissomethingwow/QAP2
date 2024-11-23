package com.keyin.domain.members;

import jakarta.persistence.*;

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
    private boolean isPremium; //if its = to true the type is Premium
    @Temporal(TemporalType.DATE)
    private Date membershipStartDate;
    @Temporal(TemporalType.DATE)
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

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        this.isPremium = premium;
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
        this.isPremium = membershipTypePremium;
        this.membershipStartDate = membershipStartDate;
        this.membershipEndDate = membershipDuration;
    }

    public Member(long id, String name, String address, String email, String phoneNumber, boolean membershipTypePremium, Date membershipStartDate, Date membershipDuration) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isPremium = membershipTypePremium;
        this.membershipStartDate = membershipStartDate;
        this.membershipEndDate = membershipDuration;
    }
}
