package com.prac.demo;
/**
 * DESC:: Calling order would be Static block, Init block (If Parent class constructor is there then parent class constructor will be called then init block),
 *  Constructor (If parent is their then first parent class constructor then Child class constructor)
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class Calling_Init_Static_Constructor extends AB {
	static {
		System.out.println("Static Block");
	}
	 {
		System.out.println("Init Block");
	}
	 public Calling_Init_Static_Constructor()
	 {
		 //Parent Class constructor
		 //Init block copied here by compiler after first statement i.e this, super
		 System.out.println("Child Constructor");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new Calling_Init_Static_Constructor();
	}

}


class AB
{
	AB()
	{
		System.out.println("Parent constructor");
	}
}
//output>> 
		//Static Block
		//Init Block
		//Constructor
