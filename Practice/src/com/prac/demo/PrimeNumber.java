package com.prac.demo;
/**
 * NUMBERS: One is not a prime or composite Number
 * 			Two is the only even prime number
 * 			Not all odd numbers are prime number  ex: 9,15,21,27,33,35
 * @author sumbarkar
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(2));

	}

	public static boolean isPrimeNumber(int num)
	{
		int n=num/2;
		if(num==1) 
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%2==0)
			{
				return false;
			}
		}
		return true;
	}
}
