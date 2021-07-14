package com.corejava.practice.javapractices.basicsofjava.collectionframework.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaHashMap extends Thread {
	
	Map<Integer,String> hashMap = new TreeMap<Integer,String>();

	/**
	 * 
	 */
	public synchronized void hashMapSimpleExample() {

		// Creating HashMap    
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

		// Put elements in Map 
		hashMap.put(1,"Abhishek");   
		hashMap.put(2,"Kumar");    
		hashMap.put(3,"Srivastava");   
		hashMap.put(4,"Rinshu");  

		System.out.println("Iterating Hashmap...");  
		for(Entry<Integer, String> entry : hashMap.entrySet()) {    
			System.out.println(entry.getKey()+" "+entry.getValue());    
		}  
	}

	/**
	 * 
	 */
	public synchronized void noDuplicateKeyOnHashMap() {

		// Creating HashMap    
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

		// Put elements in Map 
		hashMap.put(1,"Abhishek");   
		hashMap.put(2,"Kumar");    
		hashMap.put(3,"Rinshu");   
		hashMap.put(4,"Srivastava");  

		// Duplicate key
		hashMap.put(1,"Java");  
		hashMap.put(2,"Developer");  

		System.out.println("Iterating Hashmap...");  
		for(Entry<Integer, String> entry : hashMap.entrySet()) {    
			System.out.println(entry.getKey()+" "+entry.getValue());    
		}  
	}

	/**
	 * 
	 */
	public void run() {
		/* */
		//hashMapSimpleExample();
		/* */
		noDuplicateKeyOnHashMap();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JavaHashMap javaHashMap = new JavaHashMap();
		javaHashMap.start();
	}
}
