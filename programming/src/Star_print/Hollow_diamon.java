package Star_print;

public class Hollow_diamon
{
	public static void main(String[] args) 
	{
		int n=7; int sp=n/2; int st = 1;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				//if(k != 1 && i != 1 && i != n && k!=n)//k==1||k==st  
					if(k==1||k==st )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else
			{
				sp++;
				st=st-2;
			}
			
		}

	}
}
