package methodAndFunction;

public class CountOfString {

	public static void main(String[] args) {
		String s="Riju@234";
		int a=0;
		int n=0;
		int ss=0;
		for(int i=0;i<=s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='A'&& ch<='Z' || ch>='a' && ch<='z') {
				a++;
			}
			else if (ch>='0' && ch<='9') {
				n++;
			}
			else {
				ss++;
			}
		}
	System.out.println("alpha " +a);
	System.out.println("numrec " +n);
	System.out.println("special " +ss);
	}	
}
