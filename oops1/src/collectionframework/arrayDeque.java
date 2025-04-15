package collectionframework;

import java.util.ArrayDeque;

public class arrayDeque 
{
	public static void main(String[] args) 
	{
		// it is used to perform fifo
		ArrayDeque<String> name = new ArrayDeque<>();
		name.push("pankaj");
		name.push("rohit");
		name.push("sunil");
		System.out.println(name);
		name.pop();
		System.out.print(name);

	}
}
