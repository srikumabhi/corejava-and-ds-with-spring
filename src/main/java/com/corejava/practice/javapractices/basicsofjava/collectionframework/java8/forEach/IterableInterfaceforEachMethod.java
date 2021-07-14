package com.corejava.practice.javapractices.basicsofjava.collectionframework.java8.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class IterableInterfaceforEachMethod {

	/**
	 * Custom consumer action
	 */
	protected synchronized void forEachExample1UsingList() {
		try {
			ArrayList<String> arrayList = new ArrayList<String>();
			arrayList.add("Abhishek");
			arrayList.add("Kumar");
			arrayList.add("Srivastava");
			arrayList.add("Rinshu");
			arrayList.add(null);
			arrayList.add("Amit");
			arrayList.add("Kumar");
			arrayList.add("Srivastava");

			Consumer<String> makeUpperCase = new Consumer<String>(){
				@Override
				public void accept(String str){
					if(null!=str) {
						System.out.println(str.toUpperCase());
					} else {
						System.out.println("null");
					}
				}
			};

			arrayList.forEach(makeUpperCase);
		}catch (Exception ex) {
			System.out.println(ex);
		}
	}

	/**
	 * forEach over stream elements
	 */
	protected synchronized void forEachExample2UsingList() {
		try {
			List<Integer> numberList = Arrays.asList(1,2,3,4,5);

			Consumer<Integer> action = System.out::println;

			numberList.stream()
			.filter(n -> n%2  == 0)
			.forEach( action );

		}catch (Exception ex) {
			System.out.println(ex);
		}
	}

	/**
	 * 
	 */
	protected synchronized void forEachExample1UsingMap() {
		try {
			HashMap<String, Integer> map = new HashMap<>();

			map.put("Abhishek", 1);
			map.put("Kumar", 2);
			map.put("Srivastava", 3);

			//1. Map entries
			Consumer<Map.Entry<String, Integer>> action = System.out::println;
			map.entrySet().forEach(action);

			//2. Map keys
			Consumer<String> actionOnKeys = System.out::println;
			map.keySet().forEach(actionOnKeys);

			//3. Map values
			Consumer<Integer> actionOnValues = System.out::println;
			map.values().forEach(actionOnValues);

		}catch (Exception ex) {
			System.out.println(ex);
		}
	}

	/**
	 * 
	 */
	protected synchronized void forEachExample2UsingMap() {
		try {
			Map<String, String> map = new HashMap<String, String>();

			map.put("A", "Abhishek");
			map.put("B", "Kumar");
			map.put("C", "Srivastava");

			map.forEach((k, v) -> 
			System.out.println("Key = " + k + ", Value = " + v));

		}catch (Exception ex) {
			System.out.println(ex);
		}
	}

	/**
	 * Create custom BiConsumer
	 */
	protected synchronized void forEachExample3UsingMap() {
		try {
			BiConsumer<String, Integer> action = (a, b) -> { 
				System.out.println("Key is : " + a); 
				System.out.println("Value is : " + b); 
			}; 

			Map<String, Integer> map = new HashMap<>();

			map.put("A", 1);
			map.put("B", 2);
			map.put("C", 3);

			map.forEach(action);
		}catch (Exception ex) {
			System.out.println(ex);
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Thread thread1 = new Thread() {
				public void run() {
					new IterableInterfaceforEachMethod().forEachExample1UsingList();
				}
			};
			//thread1.start();

			Thread thread2 = new Thread() {
				public void run() {
					new IterableInterfaceforEachMethod().forEachExample1UsingMap();
				}
			};
			//thread2.start();

			Thread thread3 = new Thread() {
				public void run() {
					new IterableInterfaceforEachMethod().forEachExample2UsingMap();
				}
			};
			//thread3.start();

			Thread thread4 = new Thread() {
				public void run() {
					new IterableInterfaceforEachMethod().forEachExample3UsingMap();
				}
			};
			//thread4.start();
			
			Thread thread5 = new Thread() {
				public void run() {
					new IterableInterfaceforEachMethod().forEachExample2UsingList();
				}
			};
			thread5.start();

		}catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
