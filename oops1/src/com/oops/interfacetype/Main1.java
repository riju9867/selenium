package com.oops.interfacetype;
interface run
{
	int a=90;
	void test();
}
class Demo implements run
{
	public void test()
	{
		System.out.println("abstract method of interface run");
	}
}

public abstract class Main1
{
	public static void main(String[] args) 
	{
		System.out.println(run.a);
		run r1;///ref of interface
		//new run();//object of interface is not possible
		Demo d1=new Demo();
		d1.test();
	}

}
