package com.frostmourne.camp.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jamesRMBP on 04/12/14.
 */
@Entity
public class Information {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated(EnumType.STRING)
    private InformationType type;

    private String content;

    private String image;

    private Date date;

    @OneToOne
    private User author;


}
