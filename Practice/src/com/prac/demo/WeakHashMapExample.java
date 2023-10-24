package com.prac.demo;

import java.util.Map;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * DESC:: When to Use WeakHashMap over HashMap 
		-- WeakHashMap is useful for cache implementation .
		
													HashMap							WeakHashMap
1.Entry object Garbage Collected		No ,even if key object is null 				Yes  
2.Key Object Reference							Strong								Weak
3.Automatic Size decrease						No 									Yes
4.Clone method									Yes									No
5.Serialize and Deserialize objects 			Yes									No

 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class WeakHashMapExample {
    
    public static void main(String[] args) { 
 
           
        // Created HashMap and WeakHashMap objects

        Map hashmapObject = new HashMap();
        Map weakhashmapObject = new WeakHashMap();
        
       // Created HashMap and WeakHashMap keys

        String hashmapKey = new String ("hashmapkey");
        String weakhashmapKey = new String ("weakhashmapkey");

      // Created HashMap and WeakHashMap values

        String hashmapValue = "hashmapvalue";
        String weakhashmapValue = "weakhashmapvalue";  

      // Putting key and value in HashMap and WeakHashMap Object

        hashmapObject.put(hashmapKey ,hashmapValue); 
        weakhashmapObject.put(weakhashmapKey ,weakhashmapValue); 

      // Print HashMap and WeakHashMap Object : Before Garbage Collection
       
        System.out.println("HashMap before Garbage Collected :"+ hashmapObject);
        System.out.println("WeakHashMap before Garbage Collected :"+
                            weakhashmapObject);

     // Set HashMap and WeakHashMap Object keys to null

        hashmapKey = null;  
        weakhashmapKey = null;

     // Calling Garbage Collection
        System.gc(); 

    // Print HashMap and WeakHashMap Object : After Garbage Collection
       
        System.out.println("HashMap after Garbage Collected :"+ hashmapObject);
        System.out.println("WeakHashMap after Garbage Collected :"+
                            weakhashmapObject); 
 }
}


//Output :

//HashMap before Garbage Collected :{hashmapkey=hashmapvalue}
//WeakHashMap before Garbage Collected :{weakhashmapkey=weakhashmapvalue}
//HashMap after Garbage Collected :{hashmapkey=hashmapvalue}
//WeakHashMap after Garbage Collected :{}


  