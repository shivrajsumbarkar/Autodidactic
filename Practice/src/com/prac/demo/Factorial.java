package com.prac.demo;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(fact(2));

	}
	public void DemoReview()
	{
	System.out.println("Demo Review");
	}
	
	public static int fact(int num)
	{
		int result = num;
		if(num==0 || num==1)
		{
			return 1;
		}
		return result*=fact(num-1);
	}

}
