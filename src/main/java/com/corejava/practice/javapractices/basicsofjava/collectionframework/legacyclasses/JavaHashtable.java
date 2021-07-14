package com.corejava.practice.javapractices.basicsofjava.collectionframework.legacyclasses;

import java.util.Hashtable;
import java.util.Map;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaHashtable {

	@SuppressWarnings("rawtypes")
	public void javaHashtableExample() {
		Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();  

		hashtable.put(100,"Amit");  
		hashtable.put(102,"Ravi");  
		hashtable.put(101,"Vijay");  
		hashtable.put(103,"Rahul");  

		for(Map.Entry map : hashtable.entrySet()){  
			System.out.println(map.getKey()+" "+map.getValue());  
		}  
	}
}
