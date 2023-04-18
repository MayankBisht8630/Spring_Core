package com.springcore.collections;

import javax.sound.midi.SysexMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test 
{
	public static void main(String[] args)
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp11 =(Emp)context.getBean("emp1");
		System.out.println(emp11);
		System.out.println("");
		System.out.println(emp11.getName());
		System.out.println(emp11.getAddresses()); //this will give set
		System.out.println(emp11.getCourses());   //this will give map
		System.out.println(emp11.getPhones());    //this will give list
		System.out.println(emp11.getPhones().getClass().getName()); 	
		
	}
}
