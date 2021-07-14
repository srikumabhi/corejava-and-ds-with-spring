package com.corejava.practice.javapractices.basicsofjava.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaListInterface {

	/**
	 * 
	 */
	public void listExample1() {

		List<String> list = new ArrayList<String>();  

		list.add("Rinshu");  
		list.add("Srivastava");  
		list.add("Kumar");  
		list.add(1,"Abhishek");

		System.out.println("An elements of list:- "+list); 
		System.out.println("An element at 2nd position:- "+list.get(2));

		Iterator<String> iterator = list.iterator();

		while(iterator.hasNext()){    
			System.out.println("Value:"+iterator.next());    
		}
	}

	/**
	 * 
	 */
	public void listExample2(){

		List<String> list = new ArrayList<String>();  

		list.add("Java");  
		list.add("for");  
		list.add("new task");  
		list.add(1,"DevelopersBeenWithDefaultEqualsAndHashCodeMethod");

		ListIterator<String> listIterator = list.listIterator();

		System.out.println(listIterator.toString());

		while(listIterator.hasNext()){    
			System.out.println("Iterate elements in forward direction:-"+
					listIterator.next());    
		}
		while(listIterator.hasPrevious()){    
			System.out.println("Iterate elements in backword direction:-"+
					listIterator.previous());    
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread() {
			public void run() {
				new JavaListInterface().listExample1();
			}
		};
		thread1.start();

		Thread thread2 = new Thread() {
			public void run() {
				new JavaListInterface().listExample2();
			}
		};
		thread2.start();
	}
}
