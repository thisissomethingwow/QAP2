package com.keyin.domain.tournaments;

import com.keyin.domain.members.Member;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Tournament {
    @Id
    @SequenceGenerator(name = "tournament_sequence", sequenceName = "tournament_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "tournament_sequence")
    private long id;

    private Date startDate;
    private Date endDate;
    private String location;
    private double entryFee;
    private double cashPrizeAmount;

    @ManyToMany
    private List<Member> members;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public double getCashPrizeAmount() {
        return cashPrizeAmount;
    }

    public void setCashPrizeAmount(double cashPrizeAmount) {
        this.cashPrizeAmount = cashPrizeAmount;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Tournament() {
    } //for ease of testing

    public Tournament(Date startDate, Date endDate, String location, double entryFee, double cashPrizeAmount, List<Member> members) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.entryFee = entryFee;
        this.cashPrizeAmount = cashPrizeAmount;
        this.members = members;
    }

    public Tournament(List<Member> members, double cashPrizeAmount, double entryFee, String location, Date endDate, Date startDate, long id) {
        this.members = members;
        this.cashPrizeAmount = cashPrizeAmount;
        this.entryFee = entryFee;
        this.location = location;
        this.endDate = endDate;
        this.startDate = startDate;
        this.id = id;
    }
}
