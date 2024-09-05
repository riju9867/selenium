package com.oops.overloading;

public class Sample 
{
	public Sample()
	{
		System.out.println("Sample()");
	}
	protected Sample(int a)
	{
		System.out.println("Sample(int a)");	
	}
	Sample(double a)
	{
		System.out.println("Sample(double a)");
	}
	public Sample(double a , int b)
	{
		System.out.println("sample(double a , int b)");
	}
	public static void main(String[] args)
	{
		new Sample();
		new Sample(1);
		new Sample(1.2);
		new Sample(1);
		new Sample(8.9,9);
	}

}

