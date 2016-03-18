package com.nashville.core; /**
 * Created by srujangopu on 3/8/16.
 */

import com.nashville.config.MyConfig;
import com.nashville.pojo.Address;
import com.nashville.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MyProgram {

    public static void main(String arg[]){

        //ApplicationContext context = new ClassPathXmlApplicationContext("myEmailBean.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        /*Student s1 = (Student) context.getBean(Student.class);
        System.out.println(s1.getStudentName());
        System.out.println(s1.getStudentRoll());
        System.out.println(s1.getAddress());
*/

        JavaMailSenderImpl javaMailSenderImpl = (JavaMailSenderImpl) context.getBean("mailSender");

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("srujanjack@gmail.com");
        message.setTo("deepavirginia@gmail.com");
        message.setCc("srujanjack@gmail.com");
        message.setSubject("Test Email2");
        message.setText("Hello World from bean");

        javaMailSenderImpl.send(message);

    }
}
