package com.springcore.ciambigiuity;

public class Adition 

//jo bhi constructor upar hoga vo call hoga 
//if there is no string constructor present <this is order ambiguity>

{
	private int a;
	private int b;
	public Adition(int a, int b) 
	{
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int , int ");
	}
	public Adition(double a, double b) // we have done constructor overloading
	{
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor : double , double ");
	}
	public Adition(String a, String b) 
	{
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String , String "); //by default string constructor will be called if we do not 
	}                                                         //give type in xml file <this is type ambiguity><we will use type attribute>
	public void doSum()
	{
		System.out.println("Value of A is :" +this.a); //index attribute se we can change the order of a and b
		System.out.println("Value of B is :" +this.b);
		System.out.print("Sum is : " + (this.a + this.b));
	}
}
