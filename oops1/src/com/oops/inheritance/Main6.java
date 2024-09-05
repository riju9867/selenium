package com.oops.inheritance;
class Brand
{
	public void test()
	{
		System.out.println(" brand");
	}
}
class samsung extends Brand 
{
	public void redmi()
	{
		System.out.println("redmi brand");
	}
	public void nokia()
	{
		System.out.println("nokia brand");
	}
}
class laptop extends samsung
{
	public void hp()
	{
		System.out.println("hp brand");
	}
}
class building extends Brand
{
	public void room()
	{
		System.out.println("big room");
	}
	public void bigroom()
	{
		System.out.println("very big room");
	}
}
class car extends building
{
	public void key()
	{
		System.out.println("car key");
	}
}
public class Main6 
{
	public static void main(String[]args)
	{
		Brand l1;
		laptop.l1=new laptop();
		l1.Brand();
		l1.hp();
		Object c1;
		car.c1=new car();
		c1.brand();
		c1.key();

		s}
}


