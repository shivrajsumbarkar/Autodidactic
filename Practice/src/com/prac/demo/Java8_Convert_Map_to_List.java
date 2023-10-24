package com.prac.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8_Convert_Map_to_List {

	public static void main(String[] args) {
		
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

        
		System.out.println("***********Convert Map to list *****************");
 		System.out.println("Convert Map keys to list");
 		List<String> retnList = unsortMap.keySet().stream().collect(Collectors.toList());
 		retnList.forEach(System.out::println);

 		System.out.println("Convert Map values to list");
 		List<Integer> retnListt = unsortMap.values().stream()
 				.sorted(Comparator.reverseOrder())
 				.collect(Collectors.toList());
 		retnListt.forEach(System.out::println);

	}

}
