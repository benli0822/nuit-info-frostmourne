package com.frostmourne.camp;

import com.frostmourne.camp.domain.Campsite;
import com.frostmourne.camp.domain.Information;
import com.frostmourne.camp.domain.InformationType;
import com.frostmourne.camp.domain.User;
import com.frostmourne.camp.service.repository.CampsiteRepository;
import com.frostmourne.camp.service.repository.InformationRepository;
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
        InformationRepository informationRepository = context.getBean(InformationRepository.class);

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

        Information testInfo1 = new Information();

        testInfo1.setSenderPerson(testUser);
        testInfo1.setContent("test");
        testInfo1.setDate(new Date());
        testInfo1.setType(InformationType.FindMyFamily);

        Information testInfo2 = new Information();

        testInfo2.setSenderPerson(testUser);
        testInfo2.setContent("test2");
        testInfo2.setDate(new Date());
        testInfo2.setType(InformationType.Vaccine);

        Information testInfo3 = new Information();

        testInfo3.setSenderPerson(testUser);
        testInfo3.setContent("test3");
        testInfo3.setDate(new Date());
        testInfo3.setType(InformationType.Security);

        informationRepository.save(testInfo1);
        informationRepository.save(testInfo2);
        informationRepository.save(testInfo3);

    }
}
