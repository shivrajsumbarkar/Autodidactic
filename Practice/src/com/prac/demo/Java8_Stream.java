package com.prac.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8_Stream {

	public static void main(String[] args) {

		List<Emp> employeeList = new ArrayList<>();
		employeeList.add(new Emp(1, "abc"));
		employeeList.add(new Emp(2, "pqr"));
		employeeList.add(new Emp(3, "xyz"));
		employeeList.add(new Emp(4, "mno"));

		System.out.println("******** List Filter and map using stream ******");
		List<Integer> employeeList2 = employeeList.stream().filter(e -> e.getId() > 3)// filtering data
				.map(e -> e.getId()) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(employeeList2);

		//System.out.println("****** Iterate Stream *********");

//		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
//				.forEach(System.out::println);

		 String name = employeeList.stream()
	                .filter(x -> "abc".equals(x.getName()))
	                .map(Emp::getName)                        //convert stream to String
	                .findAny()
	                .orElse("");

	        System.out.println("name : " + name);

	        List<String> collect = employeeList.stream()
	        		.sorted((e1,e2)->e1.getName().compareTo(e2.getName())) //sorted on the name
	                .map(Emp::getName)
	                .collect(Collectors.toList());
	        collect.forEach(System.out::println);
	}

}
