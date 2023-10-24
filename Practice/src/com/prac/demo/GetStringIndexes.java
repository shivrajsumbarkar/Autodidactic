package com.prac.demo;

/**
 * Get the char of string as they in order like for first string get first char ...
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class GetStringIndexes {

	public static void main(String[] args) {
		
		String [] arg= {"Java","World", "Programing","Language"};
		String str="";
		
		for(int i=0;i<arg.length;i++)
		{
			str+=arg[i].charAt(i);
		}
		System.out.println(str);

	}

}
