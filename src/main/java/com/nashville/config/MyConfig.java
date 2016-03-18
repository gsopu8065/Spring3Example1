package com.nashville.config;

import com.nashville.pojo.Address;
import com.nashville.pojo.Student;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.*;

/**
 * Created by srujangopu on 3/10/16.
 */
@Configuration
@ComponentScan({"com.nashville.pojo"})
public class MyConfig {


    @Bean(name = "mailSender")
    public JavaMailSenderImpl getEmailBean(){

        JavaMailSenderImpl myBean = new JavaMailSenderImpl();
        myBean.setHost("smtp.gmail.com");
        myBean.setPort(587);
        myBean.setUsername("srujanjack");
        myBean.setPassword("Srujan8065");

        Properties props = new Properties();
        props.setProperty("mail.smtp.auth","true");
        props.setProperty("mail.smtp.starttls.enable","true");

        myBean.setJavaMailProperties(props);

        return myBean;
    }

}
