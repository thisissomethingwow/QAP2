package com.keyin.domain.tournaments;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.util.Date;

@Entity
public class Tournament {
    @Id
    @SequenceGenerator(name = "course_sequence", sequenceName = "course_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "course_sequence")
    private long id;

    private Date startDate;
    private Date endDate;
    private String location;
    private double entryFee;
    private double cashPrizeAmount;


}
