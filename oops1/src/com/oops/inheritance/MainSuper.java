package com.oops.inheritance;
class a
{
	public a(int a)
	{
		System.out.println("a class constructer");
	}
}
class b extends a
{
	public b(int a)
	{
		super(a);
		System.out.println("b class constructor");
	}
}
public class MainSuper
{
 public static void main(String[] args)
 {
   new b(78);	
}
}
