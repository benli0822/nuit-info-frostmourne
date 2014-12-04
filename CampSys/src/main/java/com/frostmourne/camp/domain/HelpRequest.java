package com.frostmourne.camp.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jamesRMBP on 04/12/14.
 */
public class HelpRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * who wants to help
     */
    @OneToOne
    private User author;

    /**
     * which kind of help request
     */
    @Enumerated(EnumType.STRING)
    private HelpRequestType type;

    private Date date;

    private String description;

    

}
