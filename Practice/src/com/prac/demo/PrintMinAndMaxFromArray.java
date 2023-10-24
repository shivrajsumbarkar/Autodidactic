 package com.prac.demo;

public class PrintMinAndMaxFromArray {

	public static void main(String[] args) {
		int [] numArray= {1,9,2,3,88,0,11,44,3};
		System.out.println("Max: "+getMaxNumber(numArray));
		System.out.println("Min: "+getMinNumber(numArray));

	}

	public static int getMaxNumber(int [] array)
	{
		int maxNum=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>maxNum)
			{
				maxNum=array[i];
			}
		}
		return maxNum;
	}
	
	public static int getMinNumber(int [] array)
	{
		int minNum=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(minNum > array[i])
			{
				minNum=array[i];
			}
		}
		return minNum;
	}
}
