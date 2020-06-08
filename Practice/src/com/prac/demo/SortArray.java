package com.prac.demo;

public class SortArray {

	public static void main(String args[])
	 {
	  int  arr[]={100,20,15,30,5,75,40};
	  bubbleSort(arr);
	  printArray(arr);
	 
	 }
	 
	 public static int[] bubbleSort(int arr[])
	 { int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	  return arr;
	 }
	 public static void printArray(int arr[])
	 {
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 System.out.print(arr[i]+" ");
		 }
	 }
	 
	
}
