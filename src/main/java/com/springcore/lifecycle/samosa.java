package com.springcore.lifecycle;

public class samosa 
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting Price");
	}

	public samosa(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}

	public samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void init()
	{
		System.out.println("Inside init method");
	}
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}
