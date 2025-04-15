package com.oops.overloading;

public class Signupp 
{
	String name;
	String email;
	long phone;
	int age;
	String pwd;

	// Constructor with email
	public Signupp(String name, String email, long phone, int age, String pwd) 
	{
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.pwd = pwd;
	}

	// Constructor without email
	public Signupp(String name, long phone, int age, String pwd) 
	{
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.pwd = pwd;
	}

	// Display user details
	public void display() 
	{
		System.out.println("Name: " + name);
		System.out.println("Email: " + (email != null ? email : "Not Provided"));
		System.out.println("Phone: " + phone);
		System.out.println("Age: " + age);
		System.out.println("Password: " + pwd);
	}

	public static void main(String[] args)
	{
		// Creating an object using the constructor
		Signupp s1 = new Signupp("customer", "cus@gmail.com", 555246554L, 15, "cust");
		s1.display(); // Display user details
	}
}


