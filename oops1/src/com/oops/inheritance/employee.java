
package com.oops.inheritance;

public class employee
{
  public employee()
  {
	  System.out.println("parent constructer");
  }
}
public class admin extends employee 
{
	
	public admin()
	 {
		 System.out.println("child constructor");
	 }
	 public static void main(String[]args)
	 {
		 admin a = new admin();
	 }

}


 