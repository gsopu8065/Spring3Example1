package com.nashville.core; /**
 * Created by srujangopu on 3/8/16.
 */

import com.nashville.pojo.Address;
import com.nashville.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyProgram {

    public static void main(String arg[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("mybeans.xml");

        Student s1 = (Student) context.getBean("student1");

        System.out.println(s1.getStudentName());
        System.out.println(s1.getStudentRoll());

        Address a1 = s1.getAddress();

        System.out.println(a1.getStreet());
        System.out.println(a1.getCity());
        System.out.println(a1.getState());

    }
}
