package com.oops.overloading;

public class Add
{
	public static void  add(int[] a)
	{
		int sum=0;
		for (int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	public static void add(double[] a)
	{
		double  sum=0;
		for (int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		int[] a1= {1,3,4,5,6,98};
		Add.add(a1);
		double[] a2= {6.2,4.5,6.7,8.9};
		Add.add(a2);

	}
}