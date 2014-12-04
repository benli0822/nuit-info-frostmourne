package com.frostmourne.camp.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by jamesRMBP on 04/12/14.
 */
@Entity
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Date date;

    /**
     * the objective of the donation
     */
    private String objective;

    /**
     * the amount of donation
     */
    private int amount;

    /**
     * who donate the money, can be a person or a organization
     */
    @OneToOne
    private User donorsPerson;

    @OneToOne
    private Organization donorsOrganization;

    @OneToMany(fetch=FetchType.LAZY)
    private Set<Campsite> receiverCamp;



}
