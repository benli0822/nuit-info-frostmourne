package com.frostmourne.camp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by jamesRMBP on 04/12/14.
 */

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String password;

    private String username;

    private String name;

    private String gender;

    //TODO check if we have needs to make a user address connect to a camp
    private String address;

    private Date birthday;



    public User(){

    }
}
