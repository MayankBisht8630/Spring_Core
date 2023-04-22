package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
        person p =(person)context.getBean("person");
        System.out.println(p);
        
	}

}
