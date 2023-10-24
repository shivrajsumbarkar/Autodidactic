package com.prac.demo;

/**
 * Def: 1. Java "inner class" or "nested class" is a class which is declared
 * inside the class or interface. 
 * # Advantages: 
 * 1) Nested classes represent a
 * special type of relationship that is it can access all the members (data
 * members and methods) of outer class including private.
 * 
 * 2) Nested classes are used to "develop more readable and maintainable code"
 * because it "logically group classes and interfaces" in one place only.
 * 
 * 3) Code Optimization: It requires less code to write. # Types of Nested
 * classes: There are two types of nested classes non-static and static nested
 * classes The non-static nested classes are also known as inner classes.
 * 
 * A. Non-static nested class (inner class) 
 * 
 * 	1. Member inner class : A class created within class and outside method.
 *  2. Anonymous inner class : A class created for implementing interface or extending class. Its name is decided by the java compiler.
 *  3. Local inner class : A class created within method. 
 *  
 * B. Static nested class : A static class created within class.
 * 
 * 
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class Inner_Class {

}

//***********Member Inner Class*************

class TestMemberOuter1 {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		TestMemberOuter1 obj = new TestMemberOuter1();
		TestMemberOuter1.Inner in = obj.new Inner();
		in.msg();
	}
}

//**********Anonymous Inner class****************
//Example with Abstract class

abstract class Person {
	abstract void eat();
}

class TestAnonymousInner {
	public static void main(String args[]) {
		Person p = new Person() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}
}

// Example with Interface

interface Eatable {
	void eat();
}

class TestAnnonymousInner1 {
	public static void main(String args[]) {
		Eatable e = new Eatable() {
			public void eat() {
				System.out.println("nice fruits");
			}
		};
		e.eat();
	}
}

//*************Local Inner Class *****************
/**
 *  A class i.e. created inside a method is called local inner class in java.
 *  If you want to invoke the methods of local inner class, you must instantiate this class inside the method.
 *  
 *  ## Local variable can't be private, public or protected.
 *  
 *  Rules for Java Local Inner class
 *  	1) Local inner class cannot be invoked from outside the method.
 *  	2) Local inner class cannot access non-final local variable till JDK 1.7. 
 *  	Since JDK 1.8, it is possible to access the non-final local variable in local inner class.
 */
 
class localInner2 {
	private int data = 30;// instance variable

	void display() {
		int value = 50;// local variable must be final till jdk 1.7 only
		class Local {
			void msg() {
				System.out.println(value);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		localInner2 obj = new localInner2();
		obj.display();
	}
}

//********************Static Nested Class ****************
/**
 * A static class i.e. created inside a class is called static nested class in java.
 * 	It cannot access non-static data members and methods. 
 * 	It can be accessed by outer class name.
 * 
 * 		1. It can access static data members of outer class including private. 
 * 		2. Static nested class cannot access non-static (instance) data member or method.
 */

// Java static nested class example with instance method

class TestOuter1 {
	static int data = 30;

	static class Inner {
		// msg() is a instance method
		void msg() {				
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		TestOuter1.Inner obj = new TestOuter1.Inner();
		obj.msg();
	}
}

// Java static nested class example with static method

/**
 * If you have the static member inside static nested class, 
 * you don't need to create instance of static nested class.
 */

class TestOuter2 {
	static int data = 30;

	static class Inner {
		//msg() is a static method
		static void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		TestOuter2.Inner.msg();// no need to create the instance of static nested class
	}
}

