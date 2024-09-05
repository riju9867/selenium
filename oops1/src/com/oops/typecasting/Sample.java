package com.oops.typecasting;
class A
{
	public void test()
	{
		System.out.println("java");
	}
}
class B extends A
{
	public void test()
	{
		System.out.println("hello");
	}
}
class C extends A
{
	public static A test(A a1)
	{
		return a1;
	}

}
public class Sample 
{
	public static void main(String[] args) {
		A a1=C.test(new A());
		B b1=(B)C.test(new B());
		A c1=C.test(new C());
	}
}
