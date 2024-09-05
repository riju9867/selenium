package com.oops.inheritance;
class person
{
	String name;
	long mobile;
	int age;
	public person(String name,long mobile,int age)
	{
		this.name=name;
		this.mobile=mobile;
		this.age=age;
	}
}
class student extends person
{
	String degree;
	double marks;
	public student(String name,long mobile,int age,String degree,double mark)
	{
		super(name,mobile, age);
		this.degree=degree;
		this.marks=mark;
	}
	public void details()
	{
		System.out.println("["+name+", " +mobile+" ,"+age+","+degree+", "+marks+"]");
	}
}
public class Main4 
{
	public static void main(String[]args)
	{
		student s1=new student("xyz",1236547890l,16,"be",70.0);
		s1.details();
		student s2=new student("abc",458745875l,20,"bca",85.0);
		s2.details();
	}

}
