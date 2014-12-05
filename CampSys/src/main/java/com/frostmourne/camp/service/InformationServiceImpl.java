package com.frostmourne.camp.service;

import com.frostmourne.camp.domain.User;
import com.frostmourne.camp.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

/**
 * Created by jamesRMBP on 05/12/14.
 */
public class InformationServiceImpl implements  InformationService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByName(long uid, String name) {
        Iterable<User> users = userRepository.findAll();

        if(users == null){
            return  null;
        }
        for(User user : users){
            if(user.getName().equals(name)){
                return user;
            }
        }

        return null;
    }
}
