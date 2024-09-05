package collectionframework;
import java.util.*;
//class customized implements Comparator<Integer>
//{
//	public int compare(Integer i1,Integer i2)
//	{
//		return i2-i1;
//	}
//}
public class samlpe11 
{
  public static void main(String[] args) 
  {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(8);
	a1.add(10);
	a1.add(6);
	a1.add(60);
	a1.add(100);
	System.out.println("before sorting"+a1);
//	Collections.sort(a1,new customized());
	System.out.println("after sorting"+a1);
  }
}
 