package com.prac.demo;

import java.util.Arrays;

public class MissingNumber {
	
	
	    public static void main(String[] args) {
	        //10 is missing
	        int[] numbers = {1,2,3,4,5,6,7,8,9, 11,12};
	         
	        int N = 12;
	        int idealSum = (N * (N + 1)) / 2;
	        System.out.println("idealSum: "+idealSum);
	        int sum = calculateSum(numbers);// Java 8 // int sum = Arrays.stream(numbers).sum();
	        int sum1 = Arrays.stream(numbers).sum();
	        System.out.println("Sum: "+sum);
	 
	        int missingNumber = idealSum - sum;
	        System.out.println("missingNumber: "+missingNumber);
	    }
	 
	    private static int calculateSum(int[] numbers) {
	        int sum = 0;
	        for (int n : numbers) {
	            sum += n;
	        }
	        return sum;
	    }
	

}
