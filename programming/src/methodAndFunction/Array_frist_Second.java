package methodAndFunction;

public class Array_frist_Second 
{
	public static void main(String[] args) 
	{
		int arr[]= {3,4,6,8,9};
		int max1= arr[0];
		int max2= arr[0];
		for (int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>max1)
			{
				max1=max2;
				max1=arr[i];
			}
				else if(arr[i]>max2 && arr[i]!=max1)
					max2=arr[i];
		}
		System.out.println(max1);
		System.out.println(max2);
	}
}
