package com.nashville.pojo;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Map;

/**
 * Created by srujangopu on 3/9/16.
 */
@Component
public class Student {

    private String studentName = "jack";
    private int studentRoll = 101;
    private Address address = new Address("101 state st", "Nashville", "TN");
    private List<String> hobbies;
    private Map<String, String> phone;

    public Student() {
    }

    public Student(String studentName, int studentRoll, Address address) {
        this.studentName = studentName;
        this.studentRoll = studentRoll;
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getPhone() {
        return phone;
    }

    public void setPhone(Map<String, String> phone) {
        this.phone = phone;
    }


    @PostConstruct
    public void showSomeThing(){
        System.out.println("This is post construct......");
    }

    @PreDestroy
    public void showSomethingBeforeDelete(){
        System.out.println("I am deleteing...bye bye");
    }
}
