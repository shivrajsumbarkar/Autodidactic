 package com.prac.demo;

public class SortArray {

	public static void main(String args[])
	 {
	  int  arr[]={100,20,15,30,5,75,40};
	  bubbleSort(arr);
	  printArrayInReverse(arr);
	  printSortedArray(arr);
	 
	 }
	 

	public static int[] bubbleSort(int arr[])
	 { int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	  return arr;
	 }
	 public static void printArrayInReverse(int[] arr)
	 {
		 System.out.println("printArrayInReverse: ");
		 for(int i=arr.length-1;i>=0;i--)
		 {
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
	 }
	 public static void printSortedArray(int[] arr) {
		 System.out.println("SortedArray: ");
		 for(int i=0;i<arr.length-1;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
			
		}
	
}
