package com.prac.demo;
/**
 * DESC:: Define heap size -Xms10m and -Xmx120m
 * @author SHIVRAJ S. UMBARKAR
 *
 */

public class MemoryUtil {
	

	public static void main(String[] args) {
		
		long maxMemory=Runtime.getRuntime().maxMemory();
		long totalMemory=Runtime.getRuntime().totalMemory();
		long freeMemory=Runtime.getRuntime().freeMemory();
		long usedMemory=totalMemory-freeMemory;
		
		System.out.println("Total Memory: "+totalMemory);
		System.out.println("Max Memory: "+maxMemory);
		System.out.println("Free Memory: "+freeMemory);
		System.out.println("Used Memory: "+usedMemory);

	}
}

