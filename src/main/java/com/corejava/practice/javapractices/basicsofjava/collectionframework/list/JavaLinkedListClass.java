package com.corejava.practice.javapractices.basicsofjava.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaLinkedListClass {

	public static JavaLinkedListClass getJavaLinkedListClass() {
		return new JavaLinkedListClass();
	}

	/**
	 * 
	 */
	protected synchronized void linkedListExample1() {
		
		LinkedList<String> linkedList = new LinkedList<String>();  
		linkedList.add("Abhishek");  
		linkedList.add("Abhishek");  
		linkedList.add("Abhishek");  
		linkedList.add("ABHISHEK");  

		Iterator<String> iIteratortr1 = linkedList.iterator(); 
		while(iIteratortr1.hasNext()) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(iIteratortr1.next());
		}
	}

	/**
	 * 
	 */
	protected void linkedListExample2() {

		LinkedList<String> linkedList = new LinkedList<String>();  
		linkedList.add("Rinshu4");  
		linkedList.add("Rinshu3");  
		linkedList.add("Rinshu2");  
		linkedList.add("Rinshu1"); 

		synchronized(this) {
			/* descendingIterator():- Returns an iterator over the elements 
			 * in this deque in reversesequential order. The elements will be 
			 * returned in order fromlast (tail) to first (head).
			 */
			Iterator<String> iIteratortr2 = linkedList.descendingIterator();
			System.out.println(iIteratortr2);
			while(iIteratortr2.hasNext()) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
				System.out.println(iIteratortr2.next());
			}
		}
	}

	/**
	 * 
	 */
	protected void linkedListExample3() {
		
		LinkedList<String> linkedList = new LinkedList<String>();  
		linkedList.add("Srivastava4");  
		linkedList.add("Srivastava3");  
		linkedList.add("Srivastava2");  
		linkedList.add("Srivastava1");  

		ListIterator<String> listIterator = linkedList.listIterator();
		
		synchronized(this) {
			while(listIterator.hasNext()) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
				System.out.println(listIterator.next());
			}
		}

		synchronized(this) {
			while(listIterator.hasPrevious()) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
				System.out.println(listIterator.previous());
			}
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread() {
			public void run() {
				getJavaLinkedListClass().linkedListExample1();
			}
		};
		thread1.setName("iterator:-");
		thread1.start();

		Thread thread2 = new Thread() {
			public void run() {
				getJavaLinkedListClass().linkedListExample2();
			}
		};
		thread2.setName("descendingIterator:-");
		thread2.start();

		Thread thread3 = new Thread() {
			public void run() {
				getJavaLinkedListClass().linkedListExample3();
			}
		};
		thread3.setName("listIterator:-");
		thread3.start();
	}
}
