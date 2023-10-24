package com.prac.demo;

public class ConstructorChaining {

	public static void main(String[] args) {
		
		A a=new A();
		System.out.println("Done");
		//Cannot pass null because applicable to char[],object, string
	}
	

}
class A 
{
	public A()
	{
		this("a");
		System.out.println("String0");
	}
	public A(String a)
	{
		this("a","a");
		System.out.println("String1");
		
	}
	public A(String a,String b)
	{
		this("a","a",1);
		System.out.println("String2");
	}
	
	public A(String a,String b,int c)
	{
	 System.out.println("String3");
	}
}
