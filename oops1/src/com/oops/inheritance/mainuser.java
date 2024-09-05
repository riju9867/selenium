package com.oops.inheritance;
class amazon
{
	public void order()
	{
		System.out.println("order successfull");
	}
}
class fashion extends amazon
{
	public  void men()
	{
		System.out.println("men faishon");
	}

	public void women()
	{
		System.out.println("women faishon");
	}
}
class electronic extends amazon
{
		public void mobile()
		{
			System.out.println("electronic mobile");
		}
	
	    
		public void laptop()
	{
		System.out.println("laptop brand");
	}
}
	class fashionbrand extends fashion
	{
		public void zara()
		{
			System.out.println("print zara brand");
		}
		public void puma()
		{
			System.out.println("print puma brand");
		}
	}
	class brandelectronic extends amazon
	{
		public void dell()
		{
			System.out.println("print dell");
		}
		public void samsung()
		{
			System.out.println("print dell"); 
		}
		public void laptop() 
		{
			System.out.println("print laptop");// TODO Auto-generated method stub
			
		}
	}

	public class mainuser 
	{
		public static void main(String[]args)
		{
			fashionbrand f1=new fashionbrand();
			f1.order();
			f1.men();
			f1.zara();

			brandelectronic b1= new brandelectronic();
			b1.order();
			b1.dell();
			b1.laptop();
		}
	}




