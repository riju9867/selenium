package methodAndFunction;

import java.util.Arrays;

public class multiple_arr
{
	public static void main(String[] args) 
	{
		int a[]= {12,23,34,56};	
		int st=0,end=a.length-1;  // st  end st<end temp
		while(st<end)
		{
			int temp =a[st];
			a[st]=a[end];
			a[end]=temp;
			st++;
			end--;
		}
		System.out.println(Arrays.toString(a));
	}
}
