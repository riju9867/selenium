package methodAndFunction;

public class array_demo 
{

	public static void main(String[] args)
	{
		int arr[] ={23,14,45,36};
		int max = arr [0];
		int min = arr [0];
		for(int i=0; i<=arr.length-1;i++)
		{
			if(arr[i]>max)

				max=arr[i];

			if(arr[i]<min)
				min=arr[i];

		}
		System.out.println(max);
		System.out.println(min);
	} 
}

