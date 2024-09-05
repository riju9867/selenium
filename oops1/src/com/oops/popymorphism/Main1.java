package com.oops.popymorphism;
class hotel
{
	public void orderfood()
	{
		System.out.println(" order successfull"); 
	}
}
class veghotel extends hotel
{
	public void orderfood()
	{
		System.out.println("veg order successfull"); 
	}	
}
class nonveghotel extends hotel
{
	public void orderfood()
	{
		System.out.println("nonveg order successfull"); 
	}
}
class service
{
	public void selecthotel(hotel h1)
	{
		h1.orderfood();
	}
}
public class Main1 
{
	public static void main(String[] args)
	{
		service s1=new service();
		s1.selecthotel(new nonveghotel());
		s1.selecthotel(new veghotel());
	}
}
