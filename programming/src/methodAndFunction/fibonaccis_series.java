package methodAndFunction;

public class fibonaccis_series
{
 public static void print(int n)
 {
	 int n1=0;
	 int n2=1;
	 int n3=0;
	 for(int i=1; i<=n; i++ )
	 {
		 n3=n1+n2;
		 n1=n2;
		 n2=n3;
	 }
	 System.out.println(n2-n1);
 }
 public static void main(String[] args)
 {
   print(8);	
}
}
