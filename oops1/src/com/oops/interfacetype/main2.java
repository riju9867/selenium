package com.oops.interfacetype;


interface Run
{
	void test();
}
interface Run1
{
	void count();
}
class example1 extends Object implements Run,Run1
{
	public void test()
	{
		System.out.println("test method of interface run");
	}
	public void count()
	{
		System.out.println("count method of interface run1");
	}
}
public class main2
{
	public static void main(String[] args) 
	{
		 example1 d1=new  example1();
		d1.test();
		d1.count();
	}

}


