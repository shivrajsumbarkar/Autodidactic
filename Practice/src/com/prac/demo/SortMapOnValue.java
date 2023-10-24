package com.prac.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * Desc:: Count occurences of digits and sort it as per count
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class SortMapOnValue {

	public static void main(String[] args) {
		Integer [] arr={1,3,5,9,9,8,9};
		List<Integer> list=(List<Integer>) Arrays.asList(arr);
		Map<Integer,Integer> map=new HashMap<>();
		
		for(Integer i:list)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
				
			}else
			{
				map.put(i,1);
			}
		}
		
		List<Entry<Integer, Integer>> sortedList=new ArrayList<Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(sortedList, new Comparator<Map.Entry<Integer, Integer>>() {
			
			public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2)
			{
				return (e2.getValue().compareTo(e1.getValue()));
			}

		});

		System.out.println(sortedList);
}
}
