package methodAndFunction;

import java.util.Arrays;

public class splite_function 
{
 public static void main(String[] args) 
 {
String str = "hello ,world,good morling";
String[] rev =str.split("[ , ]");
System.out.println(str.length());
System.out.println(Arrays.toString(rev));
System.out.println(rev.length);
}
}
