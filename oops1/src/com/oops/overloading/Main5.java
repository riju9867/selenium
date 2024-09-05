package com.oops.overloading;

class Father
{
	public void bike()
	{
		System.out.println("old bike");
	}
}
class son extends Father
{
	public void bike()
	{
		System.out.println("modified bike");
	}
}
public class Main5
{
	public static void main(String [] args)
	{
		son s1=new son();
		s1.bike();
	}
}