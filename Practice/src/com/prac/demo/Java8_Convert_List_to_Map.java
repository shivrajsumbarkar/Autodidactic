package com.prac.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * 	Note: (oldValue, newValue) -> oldValue ==> If the key is duplicated, do you prefer oldKey or newKey?
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class Java8_Convert_List_to_Map {

	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		list.add(new Emp(1, "abc"));
		list.add(new Emp(2, "pqr"));
		list.add(new Emp(3, "xyz"));
		list.add(new Emp(4, "mno"));
		System.out.println("*******************Convert List to Map: ");
		//key= id and value = name using method reference
		Map<Integer, String> map=list.stream().collect(Collectors.toMap(Emp::getId,Emp::getName));
		
		System.out.println(map);
		
		//key= id and value = name using lambda
		//Map<Integer, String> map1=list.stream().collect(Collectors.toMap(emp->emp.getId,e->e.getName));
		
		System.out.println("****************List to Map – Duplicated Key!");
		
		list.add(new Emp(3, "xyz_duplicate")); // new line with duplicate key
//Note::		
		// Map<Integer, String> map1=list.stream().collect(Collectors.toMap(Emp::getId,Emp::getName));
		//Cannot convert List to Map It will throw an error due to duplicate key
		//Output – The error message below is a bit misleading, it should show “3” instead of the value of the key.
		
				
		//To solve the duplicated key issue above, pass in the third mergeFunction argument like this :
		
		Map<Integer, String> map2=list.stream().collect(Collectors.toMap(Emp::getId,Emp::getName,
				(oldValue,newValue)-> oldValue
				));
		System.out.println("After adding duplicate key: and Handled that issue ");
		System.out.println(map2);
		
		
		System.out.println(" **************************List to Map – Sort & Collect");
		
		Map map3 = list.stream()
                .sorted(Comparator.comparing(Emp::getName).reversed())
                .collect(
                        Collectors.toMap(
                                Emp::getId, Emp::getName, // key = name, value = websites
                                (oldValue, newValue) -> oldValue,       // if same key, take the old key
                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                        ));

        System.out.println(map3);
	}

}
