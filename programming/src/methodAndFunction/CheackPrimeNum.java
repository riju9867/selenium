package methodAndFunction;

public class CheackPrimeNum 
{

	public static boolean isprime(int num)
	{
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {

	int num =100;
		for(int i=2;i<=num;i++) {
			if(isprime(i))
			System.out.println(i);
		//System.out.println(isprime(43));
		}

		
		
	}

}
