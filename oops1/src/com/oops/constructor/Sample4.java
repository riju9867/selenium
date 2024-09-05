package com.oops.constructor;

public class Sample4 
{
	String name;
	long rollno;
	double marks;
	public Sample4(String name,long rollno,double marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	public void display()
	{
		System.err.println(name);
		System.err.println(rollno);
		System.err.println(marks);

	}
	public static void main(String[] args)
	{
		Sample4 s1=new Sample4("riju",101,85.0);
		s1.display();
		Sample4 s2=new Sample4("Raju",102,87.0);
		s2.display();
	}

}
