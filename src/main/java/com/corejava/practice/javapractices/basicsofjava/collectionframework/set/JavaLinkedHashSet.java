package com.corejava.practice.javapractices.basicsofjava.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import com.corejava.practice.javapractices.basicsofjava.collectionframework.DevelopersBeenWithEqualsAndHashCodeMethodImplmentation;

/**
 * LinkedHashMap uses doubly Linked List for doing so. By using before and 
 * after - we keep track of newly added entry in LinkedHashMap, which helps us 
 * in maintaining insertion order.
 * 
 * Java LinkedHashSet class contains unique elements only like HashSet.
 * Java LinkedHashSet class provides all optional set operation and permits null 
 * elements.
 * Java LinkedHashSet class is non synchronized.
 * Java LinkedHashSet class maintains insertion order.
 *
 * @author abhishek-sriv
 * @see JavaHashSet
 */
public class JavaLinkedHashSet {

	/**
	 * 
	 * @return
	 */
	public static JavaLinkedHashSet getJavaLinkedHashSet() {
		return new JavaLinkedHashSet();
	}

	/**
	 * 
	 */
	protected synchronized void linkedHashSetExample1() {

		DevelopersBeenWithEqualsAndHashCodeMethodImplmentation developers1 = new 
				DevelopersBeenWithEqualsAndHashCodeMethodImplmentation();
		developers1.setDeveloperId(101);
		developers1.setDeveloperName("Abhishek");
		developers1.setDeveloperCompanyName("IBM");
		developers1.setDeveloperEmailId("abhishekva@ibm.co.in");

		DevelopersBeenWithEqualsAndHashCodeMethodImplmentation developers2 = new 
				DevelopersBeenWithEqualsAndHashCodeMethodImplmentation();
		developers2.setDeveloperId(102);
		developers2.setDeveloperName("Abhishek Kumar");
		developers2.setDeveloperCompanyName("TCS");
		developers2.setDeveloperEmailId("srivastava.kumar@tcs.com");

		DevelopersBeenWithEqualsAndHashCodeMethodImplmentation developers3 = new 
				DevelopersBeenWithEqualsAndHashCodeMethodImplmentation();
		developers3.setDeveloperId(103);
		developers3.setDeveloperName("Abhishek Kumar Srivastava");
		developers3.setDeveloperCompanyName("HCL");
		developers3.setDeveloperEmailId("abhishek-sriv@hcl.com");

		HashSet<DevelopersBeenWithEqualsAndHashCodeMethodImplmentation> linkedHashSet = new 
				LinkedHashSet<DevelopersBeenWithEqualsAndHashCodeMethodImplmentation>(); 
		linkedHashSet.add(developers1);
		linkedHashSet.add(developers2);
		linkedHashSet.add(developers3);

		Iterator<DevelopersBeenWithEqualsAndHashCodeMethodImplmentation> iterator = 
				linkedHashSet.iterator();
		while(iterator.hasNext()){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(iterator.next());
		}
	}

	/**
	 * 
	 */
	protected synchronized void linkedHashSetExample2() {

		DevelopersBeenWithEqualsAndHashCodeMethodImplmentation developers1 = new 
				DevelopersBeenWithEqualsAndHashCodeMethodImplmentation();
		developers1.setDeveloperId(1000);
		developers1.setDeveloperName("Abhishek Kumar Srivastava");
		developers1.setDeveloperCompanyName("Iquincesoft");
		developers1.setDeveloperEmailId("srivastava.abhi@outlook.com");

		DevelopersBeenWithEqualsAndHashCodeMethodImplmentation developers2 = new 
				DevelopersBeenWithEqualsAndHashCodeMethodImplmentation();
		developers2.setDeveloperId(1000);
		developers2.setDeveloperName("Abhishek Kumar Srivastava");
		developers2.setDeveloperCompanyName("Iquincesoft");
		developers2.setDeveloperEmailId("srivastava.abhi@outlook.com");

		DevelopersBeenWithEqualsAndHashCodeMethodImplmentation developers3 = new 
				DevelopersBeenWithEqualsAndHashCodeMethodImplmentation();
		developers3.setDeveloperId(1000);
		developers3.setDeveloperName("Abhishek Kumar Srivastava");
		developers3.setDeveloperCompanyName("Iquincesoft");
		developers3.setDeveloperEmailId("srivastava.abhi@outlook.com");

		HashSet<DevelopersBeenWithEqualsAndHashCodeMethodImplmentation> linkedHashSet = new 
				LinkedHashSet<DevelopersBeenWithEqualsAndHashCodeMethodImplmentation>(); 
		linkedHashSet.add(developers1);
		linkedHashSet.add(developers2);
		linkedHashSet.add(developers3);

		Iterator<DevelopersBeenWithEqualsAndHashCodeMethodImplmentation> iterator = 
				linkedHashSet.iterator();
		while(iterator.hasNext()){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(iterator.next());
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread() {
			public void run() {
				JavaLinkedHashSet.getJavaLinkedHashSet().linkedHashSetExample1();
			}
		};
		thread1.setName("AllObjectsAreHavingDifferentContent:-");
		thread1.start();

		Thread thread2 = new Thread() {
			public void run() {
				JavaLinkedHashSet.getJavaLinkedHashSet().linkedHashSetExample2();
			}
		};
		thread2.setName("AllObjectsAreHavingSameContent:-");
		thread2.start();
	}
}
