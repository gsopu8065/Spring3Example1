package com.nashville.core; /**
 * Created by srujangopu on 3/8/16.
 */

import com.nashville.config.MyConfig;
import com.nashville.pojo.Address;
import com.nashville.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyProgram {

    public static void main(String arg[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("mybeans.xml");

        //ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        Student s1 = (Student) context.getBean("student1");
        System.out.println(s1.getStudentName());
        System.out.println(s1.getStudentRoll());

        System.out.println(s1.getHobbies());
        System.out.println(s1.getPhone());
    }
}
