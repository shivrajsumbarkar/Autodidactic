package com.prac.demo;

public class Overloading {

	public static void main(String[] args) {
		Overloading over=new Overloading();
		over.msg(0);
	}
	
	public void msg(Integer i)
	{
		System.out.println("Integer");
	}
	public void msg(int i)
	{
		System.out.println("int");
	}

}
