package com.prac.demo;

/**
 * NUMBERS: The prime number which is divisible by 1 and the same number 0 and 1
 * are not prime numbers. One is not a prime or composite Number Two is the only
 * even prime number Not all odd numbers are prime number ex: 9,15,21,27,33,35
 * 
 * @author sumbarkar
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(3));

	}

	public static String isPrimeNumber(int num) {
		int n = num / 2;
		String rtnStr = "Prime Number";
		if (num == 1 || num == 0) {
			return "0 and 1 not a prime or composite Number.";
		} else {
			for (int i = 2; i < n; i++) {
				if (n % 2 == 0) {
					rtnStr = "Even Number";
					
				} 
				else if (n % 2 != 0) {
					rtnStr = "Odd Number";
				}
			}
			return rtnStr;
		}
		
	}
}
