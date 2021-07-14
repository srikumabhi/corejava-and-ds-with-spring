package com.corejava.practice.javapractices.basicsofjava.collectionframework.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.corejava.practice.javapractices.basicsofjava.collectionframework.DevelopersBeenWithDefaultEqualsAndHashCodeMethod;
import com.corejava.practice.javapractices.basicsofjava.collectionframework.DevelopersBeenWithEqualsAndHashCodeMethodImplmentation;

/**
 * HashMap internally use a singly linked list implemented by chaining the hash 
 * table entries.
 * 
 * HashSet stores the elements by using a mechanism called hashing.
 * HashSet contains unique elements only.
 * HashSet allows null value.
 * HashSet class is non synchronized.
 * HashSet doesn't maintain the insertion order. Here, elements are inserted on 
 * the basis of their hashcode.
 * HashSet is the best approach for search operations.
 * The initial default capacity of HashSet is 16, and the load factor is 0.75.
 *  
 * @author abhishek-sriv
 * @see JavaLinkedHashSet
 */
public class JavaHashSet {

	public static JavaHashSet getJavaHashSet() {
		return new JavaHashSet();
	}

	public JavaHashSet(){
	}

	{
		System.out.println();
	}

	{
		System.out.println();
	}

	static {
		System.out.println();
	}

	/**
	 * 
	 */
	protected void hashSetExample1(){

		Set<String> set = new HashSet<String>(); 
		set.add("One");    
		set.add("Two");    
		set.add("Three");   
		set.add("Four");  
		set.add("Five"); 

		set.add(null);
		set.add("One");
		set.add(null);

		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(Thread.currentThread().getName());
			System.out.println(iterator.next());
		}
	}

	/**
	 * 
	 */
	protected void hashSetExample2(){

		DevelopersBeenWithDefaultEqualsAndHashCodeMethod developers1 = new 
				DevelopersBeenWithDefaultEqualsAndHashCodeMethod();
		developers1.setDeveloperId(101);
		developers1.setDeveloperName("Abhishek Kumar Srivastava");
		developers1.setDeveloperCompanyName("IBM");
		developers1.setDeveloperEmailId("srikumabhi@gmail.com");

		DevelopersBeenWithDefaultEqualsAndHashCodeMethod developers2 = new 
				DevelopersBeenWithDefaultEqualsAndHashCodeMethod();
		developers2.setDeveloperId(101);
		developers2.setDeveloperName("Abhishek Kumar Srivastava");
		developers2.setDeveloperCompanyName("IBM");
		developers2.setDeveloperEmailId("srikumabhi@gmail.com");

		DevelopersBeenWithDefaultEqualsAndHashCodeMethod developers3 = new 
				DevelopersBeenWithDefaultEqualsAndHashCodeMethod();
		developers3.setDeveloperId(101);
		developers3.setDeveloperName("Abhishek Kumar Srivastava");
		developers3.setDeveloperCompanyName("IBM");
		developers3.setDeveloperEmailId("srikumabhi@gmail.com");

		Set<DevelopersBeenWithDefaultEqualsAndHashCodeMethod> set 
		= new HashSet<DevelopersBeenWithDefaultEqualsAndHashCodeMethod>(); 
		set.add(developers1);
		set.add(developers2);
		set.add(developers3);

		Iterator<DevelopersBeenWithDefaultEqualsAndHashCodeMethod> iterator = 
				set.iterator();
		while(iterator.hasNext()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(iterator.next());
		}
	}

	/**
	 * 
	 */
	protected void hashSetExample3(){

		DevelopersBeenWithEqualsAndHashCodeMethodImplmentation developers1 = new 
				DevelopersBeenWithEqualsAndHashCodeMethodImplmentation();
		developers1.setDeveloperId(101);
		developers1.setDeveloperName("Abhishek Kumar Srivastava");
		developers1.setDeveloperCompanyName("IBM");
		developers1.setDeveloperEmailId("srikumabhi@gmail.com");

		DevelopersBeenWithEqualsAndHashCodeMethodImplmentation developers2 = new 
				DevelopersBeenWithEqualsAndHashCodeMethodImplmentation();
		developers2.setDeveloperId(101);
		developers2.setDeveloperName("Abhishek Kumar Srivastava");
		developers2.setDeveloperCompanyName("IBM");
		developers2.setDeveloperEmailId("srikumabhi@gmail.com");

		DevelopersBeenWithEqualsAndHashCodeMethodImplmentation developers3 = new 
				DevelopersBeenWithEqualsAndHashCodeMethodImplmentation();
		developers3.setDeveloperId(101);
		developers3.setDeveloperName("Abhishek Kumar Srivastava");
		developers3.setDeveloperCompanyName("IBM");
		developers3.setDeveloperEmailId("srikumabhi@gmail.com");

		Set<DevelopersBeenWithEqualsAndHashCodeMethodImplmentation> set = new 
				HashSet<DevelopersBeenWithEqualsAndHashCodeMethodImplmentation>(); 
		set.add(developers1);
		set.add(developers2);
		set.add(developers3);

		Iterator<DevelopersBeenWithEqualsAndHashCodeMethodImplmentation> iterator = 
				set.iterator();
		while(iterator.hasNext()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println(iterator.next());
		}
	}

	/**
	 * Synchronized Set By Collection-Class
	 */
	protected void synchronizedSetByCollectionClass(){

		Set<String> set= Collections.synchronizedSet(new HashSet<String>());
		set.add("One");    
		set.add("Two");    
		set.add("Three");   
		set.add("Four");  
		set.add("Five"); 
		set.add("One");

		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(Thread.currentThread().getName());
			System.out.println(iterator.next());
		}
	}

	/**
	 * Unmodifiable Set By Collection-Class
	 */
	@SuppressWarnings("finally")
	protected String unmodifiableSetByCollectionClass(){
		try {
			System.out.println("In try-block!!");

			Set<String> modifiableSet= new HashSet<String>(); 
			modifiableSet.add("One");    
			modifiableSet.add("Two");    
			modifiableSet.add("Three");   
			modifiableSet.add("Four");  
			modifiableSet.add("Five"); 
			modifiableSet.add("One");

			Set<String> unmodifiableSet = Collections.unmodifiableSet(modifiableSet);

			modifiableSet.add("Rinshu");

			/* 
			 * Trying to add the new element in unmodifiableSet 
			 * java.lang.UnsupportedOperationException will throw
			 */
			unmodifiableSet.add("Abhishek");

			System.out.println("UnmodifiableSet:-"+unmodifiableSet);

			Iterator<String> iterator = unmodifiableSet.iterator();
			while(iterator.hasNext()){
				System.out.println(Thread.currentThread().getName());
				System.out.println(iterator.next());
			}

			//System.exit(0);
			return "return from try-block.";
		}catch (Exception ex){
			System.out.println("In catch-block!!");
			ex.printStackTrace();

			//System.exit(0);
			return "return from catch-block.";
		}
		finally{
			System.out.println("In finally-block!!");
			return "return from finally-block.";
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		Thread thread1 = new Thread() {
			public void run() {
				JavaHashSet.getJavaHashSet().hashSetExample1();
			}
		};
		thread1.setName("iterator:-");
		thread1.start();

		Thread thread2 = new Thread() {
			public void run() {
				JavaHashSet.getJavaHashSet().hashSetExample2();
			}
		};
		thread2.setName("DevelopersBeenWithDefaultEqualsAndHashCodeMethod:-");
		//thread2.start();

		Thread thread3 = new Thread() {
			public void run() {
				JavaHashSet.getJavaHashSet().hashSetExample3();
			}
		};
		thread3.setName("DevelopersBeenWithEqualsAndHashCodeMethodImplmentation:-");
		//thread3.start();

		Thread thread4 = new Thread() {
			public void run() {
				JavaHashSet.getJavaHashSet().synchronizedSetByCollectionClass();;
			}
		};
		thread4.setName("SynchronizedSet By Collection-Class:-");
		//thread4.start();

		Thread thread5 = new Thread() {
			public void run() {
				System.out.println(JavaHashSet.getJavaHashSet().
						unmodifiableSetByCollectionClass());
			}
		};
		thread5.setName("Unmodifiable Set By Collection-Class:-");
		//thread5.start();
	}
}
