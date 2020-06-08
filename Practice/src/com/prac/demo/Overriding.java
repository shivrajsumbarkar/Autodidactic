package com.prac.demo;

public class Overriding extends ParentClass {
	public static final String  name="XYZ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding p=new Overriding();
		//p.msg(); Not visible outside the class
System.out.println(p.name);

	}
//Cannot override static and private method
	private void msg()
	{
		System.out.println("CHildPrivate");
	}
	public static void staticMethod()
	{
		System.out.println("staticMethodChild");
	}

}

 class ParentClass {
	 public static final String  name="ABC";

	public ParentClass()
	{
		
	}
	private void msg()
	{
		System.out.println("ParentPrivate");
	}
	public static void staticMethod()
	{
		System.out.println("staticMethodParent");
	}

}
