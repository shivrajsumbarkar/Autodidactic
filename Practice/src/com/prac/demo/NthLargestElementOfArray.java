package com.prac.demo;

public class NthLargestElementOfArray {

	static int sortedArray[]=null;
	public static void main(String[] args) {
		int arr[] = { 8, 6, 4, 2, 3, 1, 5, 7, 9, 10 };
		System.out.println("Highest Number: "+getNthElementOfArray(arr));
		
		printSortedArray(sortedArray);
	}

	private static int getNthElementOfArray(int[] arr) {
		int[] rtnArr = SortArray.bubbleSort(arr);
		sortedArray =rtnArr;
		int arrLength = rtnArr.length;
		return rtnArr[arrLength - 3];
	}

	public static void printSortedArray(int[] arr) {
		System.out.println("SortedArray: ");
		for (int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
