package com.oops.pkg1;

public class Sample
{
	public int a=1;
	protected int b=2;
	         int c=3;
	private int d=4;
	public void test1()
	{
		System.out.println("public");
	}
	protected void test2()
	{
	System.out.println("protected");
	}
	void test3()
	{
		System.out.println("default");

	}
	void test4()
	{
		System.out.println("private");
	}
	public static void main(String[]args) 
	{
		Sample s1=new Sample();
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s1.c);
		System.out.println(s1.d);
		s1.test1();
		s1.test2();
		s1.test3();
		s1.test4();
	}
}     
