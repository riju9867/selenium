package methodAndFunction;

public class prinTtable 
{
//		public static void main(String[] args)
//		{
//			printTableOfFive();
//		}

		public static void printTableOfFive()
		{
			int num = 5;
			for (int i = 1; i <= 10; i++) 
			{
				int result = num * i;
				System.out.println(num + " * " + i + " = " + result);
			}
		}
		public static void main(String[] args)
		{
			printTableOfFive();
		}
	}

