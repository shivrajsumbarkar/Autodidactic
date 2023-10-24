package com.prac.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		list.add(2,new Integer(5));// java.lang.IndexOutOfBoundsException: Index: 2, Size: 0
									// it checks index against size i.e index> size
									//		private void rangeCheckForAdd(int index) {
									//	        if (index > size || index < 0)
									//	            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
									//	    }
		
	int [] ints=new int[10];
	ints[2]=3;
	System.out.println(ints.toString());

	}

}
