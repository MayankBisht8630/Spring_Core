package com.springcore.noxml.configuration;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.springcore.noxml.configuration") it is only used when we use component
public class javaConfig 
{
	@Bean
	public Samosa getsamosa() // creating bean for samosa
	{	
		return new Samosa();
	}
	
	@Bean //using bean annotation 
	public student getStudent()
	{
		//creating a new student object
		student student = new student(getsamosa());
		
		return student ;
	}
}
