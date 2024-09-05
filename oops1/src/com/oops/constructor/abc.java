package com.oops.constructor;

public class abc 
{  
	int rollno;  
	String name;  
	float fee;  
	abc(int rollno,String name,float fee)
	{  
		rollno=rollno;  
		name=name;  
		fee=fee;  
	}  
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);}  
}  
class TestThis1
{  
	public static void main(String args[])
	{  
		abc s1=new abc(111,"ankit",5000f);  
		abc s2=new abc(112,"sumit",6000f);  
		s1.display();  
		s2.display();  
	}
}  


