package com.frostmourne.camp.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by jamesRMBP on 04/12/14.
 */
@Entity
public class Campsite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String address;

    private long totalBedNb;

    /**
     * who live in this campsite
     */
    @OneToMany(fetch=FetchType.LAZY)
    private Set<User> residents;

    /**
     * who can post information for the campsite
     */
    @OneToMany(fetch=FetchType.LAZY)
    private Set<User> leaders;




}
