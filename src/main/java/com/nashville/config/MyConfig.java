package com.nashville.config;

import com.nashville.pojo.Address;
import com.nashville.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by srujangopu on 3/10/16.
 */

@Configuration
public class MyConfig {


    @Bean(name = "student1")
    @Scope("prototype")
    public Student getStudent1() {
        Student student1 = new Student();
        student1.setStudentName("Jack3.0");
        student1.setStudentRoll(3);

        List<String> hobbies = new ArrayList<String>();
        hobbies.add("Reading books");
        hobbies.add("Listining to music");
        student1.setHobbies(hobbies);

        Map<String, String> phone = new HashMap<String, String>();
        phone.put("Home", "9407821708");
        phone.put("Work", "6567567467");
        student1.setPhone(phone);

        Address a1 = new Address();
        a1.setCity("Nashville3");
        a1.setState("TN3");
        a1.setStreet("state 3");
        student1.setAddress(a1);

        return student1;
    }

}
