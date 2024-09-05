package com.oops.inheritance;
class sample
{
	final int v1=7;
	String str;
	public void test()
	{
		System.out.println("test method of sample super class");
	}
	public void count()
	{
		System.out.println("count method of sample super class");
	}
}
class Demo extends sample
{
	double z1;
	public void display()
	{
		System.out.println("display method of demo sub class");
	}
}
public class Main2 
{ 
	public static void main(String[] args) 
	{
		sample s1 =new sample();
		s1.str="hello";
		System.out.println(s1.str);
		System.out.println(s1.v1);
		s1.test();
		s1.count();
		Demo d1=new Demo();
	
}

}
