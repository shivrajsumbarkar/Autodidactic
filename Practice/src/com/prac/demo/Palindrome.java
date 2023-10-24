package com.prac.demo;

/**
 * DESC::From both side it is same i.e. NITIN
 * 
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class Palindrome {

	public static void main(String[] args) {

		System.out.println(checkPalindrom("NITIN"));
		System.out.println(checkPalindromWithoutLibrary("NITIN"));

	}

	public static boolean checkPalindrom(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		return str.equals(rev);
	}

	public static boolean checkPalindromWithoutLibrary(String str) {
		String rev = "";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse :" + rev);
		return rev.equals(str);
	}

}
