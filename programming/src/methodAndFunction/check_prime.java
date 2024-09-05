package methodAndFunction;

public class check_prime 
{
 public static boolean isprime(int n)
 {
	 for(int i=1;i<=n/2;i++)
	 {
		 if(n%i==0)
			 return true;
		
	 }
	 return false;
 }
 public static void main(String[] args) 
 {
   System.out.println(isprime(14));	
}
}
