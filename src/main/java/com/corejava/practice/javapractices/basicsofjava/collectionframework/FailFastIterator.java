package com.corejava.practice.javapractices.basicsofjava.collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class FailFastIterator extends Thread{
	/**
	 * 
	 */
	public void implementationOfFailFastIteratorWithArrayList() {
		try {
			List<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(0);
			arrayList.add(1);
			arrayList.add(2);
			arrayList.add(3);
			arrayList.add(4);

			System.out.println(arrayList);

			Iterator<Integer> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				System.out.println("Taking next element now");
				Integer current = (Integer) iterator.next();

				System.out.println("Performing iteration for element  = " + current );

				if (current.equals(2)) {
					arrayList.remove(arrayList.remove(2));
				}
			}

			System.out.println(arrayList);

		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public void implementationOfFailFastIteratorWithMap() {
		try {
			// Creating HashMap    
			HashMap<Integer,String> hashMap = new HashMap<Integer,String>();

			// Put elements in Map 
			hashMap.put(1,"Abhishek");   
			hashMap.put(2,"Kumar");    
			hashMap.put(3,"Srivastava");   
			hashMap.put(4,"Rinshu");  

			Iterator<Integer> iterator = hashMap.keySet().iterator();
			while (iterator.hasNext()) {
				Integer key = iterator.next();
				System.out.println("Map Value:" + hashMap.get(key));
				if (key.equals(3)) {
					hashMap.remove(3);
					hashMap.put(5,"Srivastava");
					hashMap.put(6,"JavaDeveloper");
				}
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public void implementationOfFailFastIteratorWithCopyOnWriteArrayList() {
		try {
			List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<Integer>();
			copyOnWriteArrayList.add(0);
			copyOnWriteArrayList.add(1);
			copyOnWriteArrayList.add(2);
			copyOnWriteArrayList.add(3);
			copyOnWriteArrayList.add(4);

			System.out.println(copyOnWriteArrayList);

			Iterator<Integer> iterator = copyOnWriteArrayList.iterator();
			while (iterator.hasNext()) {
				System.out.println("Taking next element now");
				Integer current = (Integer) iterator.next();

				System.out.println("Performing iteration for element:-" + current );

				if (current.equals(2)) {
					copyOnWriteArrayList.remove(copyOnWriteArrayList.remove(2));
				}
			}
			System.out.println(copyOnWriteArrayList);
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public void implementationOfFailFastIteratorWithConcurrentHashMap() {
		try {
			// Creating ConcurrentHashMap    
			Map<Integer,String> concurrentHashMap = new ConcurrentHashMap<Integer,String>();

			// Put elements in ConcurrentHashMap 
			concurrentHashMap.put(1,"Abhishek");   
			concurrentHashMap.put(2,"Kumar");    
			concurrentHashMap.put(3,"Srivastava");   
			concurrentHashMap.put(4,"Rinshu");  

			Iterator<Integer> iterator = concurrentHashMap.keySet().iterator();
			while (iterator.hasNext()) {
				Integer key = iterator.next();
				System.out.println("Map Value:" + concurrentHashMap.get(key));
				if (key.equals(3)) {
					concurrentHashMap.remove(3);
					concurrentHashMap.put(5,"Srivastava");
					concurrentHashMap.put(6,"JavaDeveloper");
				}
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

	public void run() {
		try {
			//implementationOfFailFastIteratorWithArrayList();
			//implementationOfFailFastIteratorWithMap();
			implementationOfFailFastIteratorWithCopyOnWriteArrayList();
			//implementationOfFailFastIteratorWithConcurrentHashMap();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FailFastIterator failFastIterator = new FailFastIterator();
		failFastIterator.start();
	}
}
