package methodAndFunction;

public class rev_str 
{
	public static String check(String str)
	{
		String rev=" ";
		//for(int i=str.length()-1;i>=0;i--);
		for(int i=0;i<=str.length()-1;i++)
		{
			rev=str.charAt(i)+rev; 
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		System.out.println(check("riju"));
	}
}
