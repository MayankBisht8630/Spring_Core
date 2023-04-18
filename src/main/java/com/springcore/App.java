package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Learning Spring =Dependency Injection");
        
//        it will b using setter injection
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/cofig.xml"); //getting object from IoC container
        Student student1 = (Student)context.getBean("Student1");
        //this manages the complete life cycle of object 
        
        System.out.println(student1);
        //yaha pe jub hum student1 print kar rehai hai toh to hum refence value mil rehi hai jo ki humne pass kari hai because of toString method
        //If we do not use toString method so it will print a hash value 
        //iska fayada yeh hai ki hume kuch changes karna hai toh we just change xml file and the the changes will reflect automatically in all
        
        //setting second bean 
        System.out.println();
        System.out.println("Getting Second bean");
        Student student2 = (Student)context.getBean("Student2");
        System.out.println(student2);
        
    }
}
