package com.oops.overloading;

public class Signupp
{
	String name;
	String email;
	long phone;
	int age;
	String pwd;
	public void signupp(String name,String email,long phone ,int age ,String pwd)
	{
		this.name=name;
		this.email=email;
		this.phone=phone;
		this.age=age;
		this.pwd=pwd;
	}
	public void signupp(String name,long phone,int age,String pwd)
	{
		this.name=name;
		this.phone=phone;
		this.age=age;
		this.pwd=pwd;
	}
	public static void main(String[] args)
	{
		signupp s1=new signupp("customer","cus@gmail.com",555246554,15,"cust");
		signupp s2=new signupp("customer","cus2@gmail.com",12345678,17,"cust2");
	}

}
