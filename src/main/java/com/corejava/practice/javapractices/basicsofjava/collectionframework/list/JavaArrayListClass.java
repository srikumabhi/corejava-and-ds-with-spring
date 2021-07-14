package com.corejava.practice.javapractices.basicsofjava.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaArrayListClass{

	/**
	 * 
	 */
	protected synchronized void arrayListExample1() {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Abhishek");
		arrayList.add("Kumar");
		arrayList.add("Srivastava");
		arrayList.add(null);

		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(iterator.next());
		}
	}

	/**
	 * 
	 */
	protected void arrayListExample2() {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("JDK5");
		arrayList.add("JDK4");
		arrayList.add("JDK3");
		arrayList.add("JDK2");
		arrayList.add("JDK1");
		arrayList.add(null);

		synchronized(this) {
			ListIterator<String> listIterator = arrayList.listIterator();
			while(listIterator.hasNext()) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(listIterator.next());
			}
			while(listIterator.hasPrevious()) {
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
				new JavaArrayListClass().arrayListExample1();
			}
		};
		thread1.setName("iterator:-");
		thread1.start();

		Thread thread2 = new Thread() {
			public void run() {
				new JavaArrayListClass().arrayListExample2();
			}
		};
		thread2.setName("listIterator:-");
		thread2.start();
	}
}
