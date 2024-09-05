package Star_print;

public class print_no 
{
  public static void main(String[] args) 
  {
	 int n= 5;
	 for(int i=1;i<=n;i++)
	 {
		 for(int j=1;j<=n-1;i++)
		 {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++)
		 {
			 System.out.print(k+" ");
		 }
		 System.out.println( );
	 }
}
}
