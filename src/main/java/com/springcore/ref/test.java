package com.springcore.ref;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refrenceconfig.xml");
        A a =(A)context.getBean("aref");
        System.out.println(a);
        System.out.println(a.getX());
        System.out.println(a.getOb().getY());
        // by this we are usig refrence type of injection 
	}

}
