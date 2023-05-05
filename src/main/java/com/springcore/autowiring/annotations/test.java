package com.springcore.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/annotations/autoconfig.xml");
        Emp e =(Emp)context.getBean("emp1");
        System.out.println(e);
	}

}
