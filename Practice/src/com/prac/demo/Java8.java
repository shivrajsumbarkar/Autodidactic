package com.prac.demo;

import java.util.*;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		//Sort List 
		System.out.println("Iterate List using java 8");
		List<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		//Java8
		System.out.println("Iterate using forEcah() method");
		//method reference
		list.stream().forEach(System.out::println);
		//Using lambda
		list.stream().forEach(p->System.out.println(p));
		
		//java7
		System.out.println("Iterate using for each loop");
		for(String str:list)
		{
			System.out.println(str);
		}
		//Iterator
		System.out.println("Iterate using iterator");
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Sort Map
		System.out.println("Iterate Map using java 8");
		Map<String, String> map=new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		
		//Java8
		System.out.println("Iterate using forEcah() method");
		map.forEach((k,v)->System.out.println(k+"--"+v));
		
		//java7
		System.out.println("Iterate using for each loop");
		for(Map.Entry me:map.entrySet())
		{
			System.out.println(me.getKey()+"--"+me.getValue());
		}
		//Iterator
		System.out.println("Iterate using iterator");
		Set set=map.entrySet();
		Iterator itmap=set.iterator();
		while(itmap.hasNext())
		{
			Map.Entry me=(Map.Entry)itmap.next();
			System.out.println(me.getKey()+"--"+me.getValue());
		}
		
		//Sort Set
		Set<String> sett=new HashSet<>();
		sett.add("A");
		sett.add("B");
		sett.add("C");
		sett.add("D");
		
		//java8
		System.out.println("Iterate set using lamda for each method");
		sett.stream().forEach(p->System.out.println(p));
		System.out.println("Iterate set using method reference");
		sett.stream().forEach(System.out::println);
		
		//java7
		System.out.println("Iterate set using for each loop");
		for(String str:sett)
		{
			System.out.println(str);
		}
		System.out.println("Iterate set using iterator");
		Iterator itset=sett.iterator();
		while(itset.hasNext())
		{
			System.out.println(itset.next());
		}
		
		//Convert Map to list
		System.out.println("Convert Map keys to list");
		List<String> retnList=map.keySet().stream().collect(Collectors.toList());
		retnList.forEach(System.out::println);
		
		System.out.println("Convert Map values to list");
		List<String> retnListt=map.values().stream().collect(Collectors.toList());
		retnListt.forEach(System.out::println);
		
	}
	
}
