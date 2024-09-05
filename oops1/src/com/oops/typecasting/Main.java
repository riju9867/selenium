package com.oops.typecasting;
class Superclass
{
	public void check()
	{
		System.out.println("java");
	}
}
class Subclass extends Superclass
{
	public void check()
	{
		System.out.println("hello");
	}
}
public class Main
{
	public static void main(String[] args) 
	{
		Superclass s1=new Subclass();
		s1.check();
	}
}

