package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean,DisposableBean
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// work as init method
		System.out.println("Taking Pepsi");
	}

	public void destroy() throws Exception {
		// work as destroy method
		System.out.println("Destroying The Pepsi ");
	}
	
	
}
