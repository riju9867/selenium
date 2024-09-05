package com.oops.overloading;

public class Signup 
{
String name;
String email;
long phoneno;
int age;
String password;
public Signup(String name ,String email,long phoneno, int age,String password)
{
	this.name=name;
	this.email=email;
	this.phoneno=phoneno;
	this.age=age;
	this.password=password;
	}
public static void main(String[] args)
{
	Signup s1=new Signup("riju","riju@gmail.com",909876541,20, "riju123");
	Signup s2=new Signup("parveen kumar","parveen@gmail.com",908765312,22,"parveen123");
}
}
