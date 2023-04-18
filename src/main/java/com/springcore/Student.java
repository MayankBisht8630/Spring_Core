package com.springcore;

public class Student  // This is a bean 
{
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setting Student Id ");
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name ");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Student Address ");
		this.studentAddress = studentAddress;
	}
	
//	generating constructor
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	jese he hum object ko print kerange toh uska refrence variable ko yeh print kar dega isliyiae we use to string method
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	
//	ab yeh bean ban gaya lekin hum iska object nehi banayange hum IoC container ko bolenge vo hume atomatically object banake dega
	
}
