package methodAndFunction;

import java.util.Scanner;

public class N_to_Power_of_P 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the n and p value");
		int n = sc.nextInt();
		int p = sc.nextInt();
		int pow=1;
		for(int i=1;i<=p;i++)
		{
			pow=pow*n;
		}
		System.out.println(pow);
	}
}
