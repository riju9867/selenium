package methodAndFunction;

public class rev_str 
{
  public static String rev(String str)
  {
	  String rev=" ";
	  for(int i=0;i<=str.length()-1;i++)
	  {
		 rev=str.charAt(i)+rev; 
	  }
	  return rev;
  }
  public static void main(String[] args) 
  {
	System.out.println(rev("riju"));
}
}
