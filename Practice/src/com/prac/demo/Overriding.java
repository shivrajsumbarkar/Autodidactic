package com.prac.demo;

/**
 * 
 * @author SHIVRAJ S. UMBARKAR
 *
 *         DESC:: Private, static , final methods cannot override If we override
 *         final method it gives compile time error If we override private and
 *         static method it would be child class method and that we cannot call
 *         overriding
 *         For overriding parent class method should be overridden.
 *         
 * ExceptionHandling with MethodOverriding in Java
   There are many rules if we talk about method overriding with exception handling. The Rules are as follows:
		
		  1.  If the superclass method does not declare an exception:
		        If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
		  2.  If the superclass method declares an exception:
		        If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
        
 */
public class Overriding extends ParentClass {
	public static final String name = "XYZ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass p = new Overriding();
		 //p.msg(); Parent class Private method is not visible outside the class, compilation error
		 p.staticMethod();// Parent class static method will be called always because we cannot override static method.
		 
		System.out.println(p.name);

	}
//Cannot override static and private method
//	private void msg()
//	{
//		System.out.println("CHildPrivate");
//	}
//	public static void staticMethod()
//	{
//		System.out.println("staticMethodChild");
//	}
	public void msd()
	{
		System.out.println("msd");
	}

}

class ParentClass {
	public static final String name = "ABC";

	public ParentClass() {

	}

	private void msg() {
		System.out.println("ParentPrivate");
	}

	public static void staticMethod() {
		System.out.println("staticMethodParent");
	}

	public final void finalMethod() {
		System.out.println("finalcMethodPArent");
	}

}
