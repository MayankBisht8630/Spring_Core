package com.springcore.noxml.configuration;

import org.springframework.stereotype.Component;


public class student 
{
	private Samosa samosa;
	
	
	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public void stydy()
	{
		this.samosa.display();
		System.out.println("Student is studiying");
	}
}
