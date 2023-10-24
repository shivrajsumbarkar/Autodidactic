package com.prac.demo;
/**
 * 1. Default method introduced in Interface in java 8 for backward compatibility
 * 2. If two interfaces i.e Interfce1 and Interfce1 has same method then Implementation class has to override a Default method in class.
 * 	  else class will not compile.
 * 3. If Interfce1 extends Interfce2 then Implementation will compile successfully and Immediate parent interface method will be called i.e Interfce2 method 
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class DefaultMethod implements Interfce1, Interfce2{ 

	public static void main(String[] args) {
		DefaultMethod d=new DefaultMethod();
		d.msg();

	}
	//Default method implementation if both interfaces have same method
//	public void msg()
//	{ 
//		System.out.println("Hi Demo");
//	}
}
interface Interfce1 
{
	default void msg()
	{
		System.out.println("Hi Interfce1");
	}
}
interface Interfce2 extends Interfce1
{
	default void msg()
	{
		System.out.println("Hi Interfce2");
	}
}