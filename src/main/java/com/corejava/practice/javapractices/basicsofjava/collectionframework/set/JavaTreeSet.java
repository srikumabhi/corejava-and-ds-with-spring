package com.corejava.practice.javapractices.basicsofjava.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaTreeSet{

	/**
	 * Simple example of Java TreeSet.
	 */
	protected synchronized void treeSetExample1() {

		//Creating and adding elements  
		TreeSet<String> treeSet = new TreeSet<String>();  
		treeSet.add("Abhishek");  
		treeSet.add("Kumar");  
		treeSet.add("Srivastava");  

		//treeSet.add(null); 
		treeSet.add("Rinshu");
		treeSet.add("Abhishek");
		//treeSet.add(null); 

		//Traversing elements  
		Iterator<String> iterator = treeSet.iterator();  

		while(iterator.hasNext()){  
			System.out.println(iterator.next());  
		}  
	}

	/**
	 * Example of traversing elements in descending order.
	 */
	protected synchronized void treeSetExample2() {

		TreeSet<String> treeSet = new TreeSet<String>();  
		treeSet.add("Abhishek");  
		treeSet.add("Srivastava");  
		treeSet.add("Rinshu");  

		System.out.println("Traversing element through Iterator in descending order");  
		Iterator<String> iterator = treeSet.descendingIterator();  
		while(iterator.hasNext()) {  
			System.out.println(iterator.next());  
		}

		System.out.println(treeSet.descendingSet());
	} 

	/**
	 * Example to retrieve and remove the highest and lowest Value.
	 */
	protected synchronized void treeSetExample3() {

		TreeSet<Integer> treeSet = new TreeSet<Integer>();  
		treeSet.add(24);  
		treeSet.add(66);  
		treeSet.add(12);  
		treeSet.add(15);  

		System.out.println("Highest Value:- "+treeSet.pollFirst());  
		System.out.println("Lowest Value:- "+treeSet.pollLast());    
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		JavaTreeSet javaTreeSet = new JavaTreeSet();

		/**
		 * 
		 */
		Thread thread1 = new Thread(){
			public void run() {
				javaTreeSet.treeSetExample1();
			}
		};
		thread1.start();

		/**
		 * 
		 */
		Thread thread2 = new Thread(){
			public void run() {
				javaTreeSet.treeSetExample2();
			}
		};
		//thread2.start();

		/**
		 * 
		 */
		Thread thread3 = new Thread(){
			public void run() {
				javaTreeSet.treeSetExample3();
			}
		};
		//thread3.start();
	}
}
