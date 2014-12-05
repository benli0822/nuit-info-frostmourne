package com.frostmourne.camp;

import com.frostmourne.camp.domain.Campsite;
import com.frostmourne.camp.domain.User;
import com.frostmourne.camp.service.repository.CampsiteRepository;
import com.frostmourne.camp.service.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

/**
 * Created by JIN Benli on 04/12/14.
 */
@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        UserRepository userRepository = context.getBean(UserRepository.class);
        CampsiteRepository campsiteRepository = context.getBean(CampsiteRepository.class);

        User testUser = new User();
        Campsite testCamp = new Campsite();
        testCamp.setAddress("testCamp");
        testCamp.setTotalBedNb(20);

        campsiteRepository.save(testCamp);

        testUser.setName("test");
        testUser.setAddress(testCamp);
        testUser.setPassword("test");
        testUser.setUsername("test");
        testUser.setBirthday(new Date());
        testUser.setGender("Mr");

        userRepository.save(testUser);
    }
}
