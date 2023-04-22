package com.springcore.ci;

public class person 
{
	private String name;
	private int personId;
	private Certi certi;
	
	//here we will use constructor injection 
	public person(String name , int personId ,Certi certi)
	{
		this.name=name;
		this.personId=personId;
		this.certi=certi;
	}

	@Override
	public String toString() 
	{
		return this.name +" : "+this.personId+" { "+this.certi.name+" }";
	}
	
	
}
