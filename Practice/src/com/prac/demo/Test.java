package com.prac.demo;

public class Test {

	public static void main(String[] args) {
		Test t=new Test();
		t.msg(null); //Compilation error Because String and Integer both are on same level and Object is a common parent

	}
	public void msg(Object o)
	{
	System.out.println("Object");	
	}
	public void msg(Exception s)
	{
	System.out.println("Exception");	
	}
	
	public void msg(ArithmeticException i)
	{
	System.out.println("ArithmeticException");	 
	}

}
