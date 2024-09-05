package com.oops.encapsulation;

class User 
{
	private String Email;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	private String pw;

}
class loginpage
{

	public void signup(String Email,String pw,User u1)
	{
		u1.setEmail(Email);
		u1.setPw(pw);
		System.out.println(u1.getEmail()+"signup successfull");
	}
	public void login(String email,String pw,User u1)
	{
		if(u1.getEmail()==email&&u1.getPw()==pw)
		{
			System.out.println(u1.getEmail()+"login successfull");
		}
		else
		{
			System.out.println("invalid email or pw");
		}
	}
	public class main2
	{
		public static void main(String[] args)
		{
			User u1=new  User();
			loginpage lp = new loginpage();
			lp.signup("abcgmail.com","123",u1);
			lp.login("abc@gmail.com","123",u1);

			User u2=new  User();
			lp.signup("xyz@gmail.com","6987",u2);
			lp.login("xyz@gmail.com","6987",u2);
		}
	}
}

