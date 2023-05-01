package com.springcore.ciambigiuity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/ciambigiuity/ciambiguityconfig.xml");
        Adition a =(Adition) context.getBean("add");
        a.doSum();
       
	}

}
