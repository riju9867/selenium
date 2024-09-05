package collectionframework;

import java.util.*;

public class Samlpe 
{
 public static void main(Object[]args)
 {
	 ArrayList<Object> alist = new  ArrayList<Object>();
	 alist.add(1);
	 alist.add(5);
	 alist.add("hello");
     alist.add('a');
     alist.add(null);
     alist.add(1);
     alist.add(null);
     System.out.println("alist");
     System.out.println(alist.get(0));
     System.out.println("------");
     for(int i=0; i<=alist.size()-1;i++)
     {
    	 System.out.println(alist.get(i));
     }
}
}