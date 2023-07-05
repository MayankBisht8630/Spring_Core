package com.springcore.noxml.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.stereotype.Component;

//@Component
public class test {
//we do not used the xml file we do configuration using javaConfig java class
//we have used java based configuration in this 
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
		student student =(student)context.getBean("getStudent");
		System.out.println(student);
		student.stydy(); 
		
	}

}
