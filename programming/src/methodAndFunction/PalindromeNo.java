package methodAndFunction;

public class PalindromeNo 
{

	public static boolean ispalindrome(int num)
	{
		int rev=0; int temp=num;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		System.out.println(ispalindrome(121));
	}
}
