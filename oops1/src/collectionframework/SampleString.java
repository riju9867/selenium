package collectionframework;
import java.util.*;
class Customized implements Comparator<String>
{
	public int compare(String i1,String i2)
	{
		return i1.compareTo(i2);
	}
}

public class SampleString {
	public static void main(String[] args) 
	  {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("aad");
		a1.add("hji");
		a1.add("rjmn");
		a1.add("dkj");
		a1.add("ghg");
		System.out.println("before sorting"+a1);
		Collections.sort(a1,new Customized());
		System.out.println("after sorting"+a1);
	  }

}
