package com.oops.overloading;

 class MainEmployee1
{
	private String name;
	private int id;
	private double sal;
	// getter and Setter method
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public double getSal()
	{
		return sal;
	}
	public void setName(String name)
	{
		this.name=name;

	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setsal(double sal)
	{
		this.sal=sal;
	}
}

public class MainEmployee
{
	public static void main(String[] args)
	{
		MainEmployee1 e1=new MainEmployee1();
		e1.setName("Riju");
		e1.setId(569);
		e1.setsal(90000.0);
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		System.out.println(e1.getSal());
	}
}

