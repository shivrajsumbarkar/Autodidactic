package com.prac.demo;

import java.io.Serializable;
//Eager implementaion : No need to take care of double checking for multi-threading

public class Singleton implements Cloneable, Serializable{
	public static final Singleton instance =new Singleton();
	
	private Singleton()
	{
		//To avoid to create object through reflection api 
		if(instance!=null)
		{
			throw new IllegalStateException("Instance is already created");
		}
		//private constructor
	}
	//Solution to avoid clone of this singleton class
	 @Override
	  protected Object clone() throws CloneNotSupportedException  
	  { 
	    throw new CloneNotSupportedException(); 
	  } 
	 
	 //Implement readResolve() method to avoid serialization of this class
	 
	 protected Object readResolve()
	 {
		 return instance;
	 }
	 
	 //To overcome to reflection api use enum
//	 public enum SingletonEnum  
//	 { 
//	   instance; 
//	 }
	 
}
