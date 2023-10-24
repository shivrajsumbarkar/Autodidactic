package com.prac.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8_SortMap_List_Comparator {
	public static void main(String[] arg) {
		/**
		 * Sort and iterate a List objects using Comparator in java 8 
		 * sort() method has been added in List interface in java 8 
		 * forEach() method of Iterable interface used to iterate list
		 */
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(1, "abc"));
		list.add(new Emp(2, "pqr"));
		list.add(new Emp(3, "xyz"));
		list.add(new Emp(4, "mno"));


		System.out.println("Sort List of emp on the basis of \"NAME\" using List.sort()");

		Comparator<Emp> empComparator = (ce1, ce2) -> ce1.getName().compareTo(ce2.getName());
		list.sort(empComparator); // Use to reverse the list empComparator.reversed()
		list.forEach(s -> System.out.println(s.getId() + "==" + s.getName()));

		System.out.println("Sort List of emp on the basis of \"ID\" using List.sort()");

		list.sort((ie1, ie2) -> ie1.getId() - ie2.getId());
		list.forEach(s -> System.out.println(s.getId() + "==" + s.getName()));

		/**
		 * Steps to sort a Map in Java 8.
		 * 
		 * 	1. Convert a Map into a Stream 
		 * 	2. Sort it 
		 * 	3. Collect and return a new LinkedHashMap (keep the order)
		 */

		/*
		 * Map result = map.entrySet().stream() 
		 * 				.sorted(Map.Entry.comparingByKey())
		 * 				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
		 * 				(oldValue,	newValue) -> oldValue, LinkedHashMap::new));
		 * 
		 * Note::
		 * 		(oldValue, newValue) -> oldValue ==> If the key is duplicated, do you prefer oldKey or newKey?
		 * 		By default, Collectors.toMap will returns a HashMap
		 */
		
		
		Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println("***********Sort By Keys**********");
        System.out.println("Original Map: "+unsortMap);

        // sort by keys, a,b,c..., and return a new LinkedHashMap
        // toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        System.out.println("Sorted Map: "+result);
        
        System.out.println("***********Sort By Values**********");
        System.out.println("Original Map: "+unsortMap);
        
        ////sort by values, and reserve it, 10,9,8,7,6...
        Map<String, Integer> result1=unsortMap.entrySet().stream()
        		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
        				(oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        System.out.println("Sorted Map: "+result1);
        		
	}

}
