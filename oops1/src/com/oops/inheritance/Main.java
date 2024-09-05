package com.oops.inheritance;
class father
{
	public void car()
	{
		System.out.println("car of father");
	}
}
class son extends father
{
 public void bike()
 {
	 System.out.println("bike of son");
 }
}

public class Main 
{
	public static void main(String[] args) 
	{
	  father f1=new father();
	  f1.car();
	  son s1=new son();
	  s1.car();
	  s1.bike();
	}

}
