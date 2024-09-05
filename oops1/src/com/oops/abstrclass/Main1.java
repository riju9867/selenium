package com.oops.abstrclass;
abstract class Sample
{
	abstract public void test();
	public static void count()
	{
		System.out.println("static method of abstract class");

	}
	public void display()
	{
		System.out.println("non-static method of abstract");
	}
}
class Demo extends Sample
{
	public void test()
	{
		System.out.println("abstract method of sample class is overridden");
	}
}
public class Main1 
{
	public static void main(String[] args) 
	{
	
		//new sample(); sample is abstract class and we can't create object
		Demo d1=new Demo();
		d1.test();
		Sample.count();
		d1.display();
	}
}
