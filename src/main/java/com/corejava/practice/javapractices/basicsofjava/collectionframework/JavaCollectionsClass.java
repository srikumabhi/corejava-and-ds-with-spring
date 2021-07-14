package com.corejava.practice.javapractices.basicsofjava.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaCollectionsClass extends Thread {

	/**
	 * 
	 */
	public void javaCollectionsUseOfAddAndAddAllMeth() {
		/*  */
		List<String> arrayList = new ArrayList<String>(); 

		/*  */
		arrayList.add("C");  
		arrayList.add("Core Java");  
		arrayList.add("Advance Java"); 
		System.out.println("Initial collection value:-"+arrayList); 

		/*  */
		Collections.addAll(arrayList, "Servlet","JSP");  
		System.out.println("After adding elements collection value:-"+arrayList); 

		/*  */
		String[] stringArray = {"C#", ".Net"};  
		Collections.addAll(arrayList, stringArray);  
		System.out.println("After adding array collection value:-"+arrayList);  
	}

	/**
	 * 
	 */
	public void javaCollectionsExampleMaxMeth(){

		List<Integer> arrayList = new ArrayList<Integer>(); 
		arrayList.add(46);  
		arrayList.add(67);  
		arrayList.add(24);  
		arrayList.add(16);  
		arrayList.add(8);  
		arrayList.add(12);  

		System.out.println("Value of maximum element from the collection: "
				+Collections.max(arrayList));
	}

	/**
	 * 
	 */
	public void javaCollectionsExampleMinMeth1(){

		List<Integer> list = new ArrayList<Integer>();  
		list.add(46);  
		list.add(67);  
		list.add(24);  
		list.add(16);  
		list.add(8);  
		list.add(12); 

		System.out.println("Value of minimum element from the collection: "
				+Collections.min(list));  
	}

	/**
	 * 
	 */
	public void javaCollectionsExampleMinMeth2(){

		List<String> arrayList = new ArrayList<String>();  
		arrayList.add("Abhishek");  
		arrayList.add("Kumar");  
		arrayList.add("Srivastava");  
		arrayList.add("Rinshu");  

		System.out.println("Value of minimum element from the collection: "
				+Collections.min(arrayList));  
	}

	/**
	 * 
	 */
	public void run() {
		/* */
		//javaCollectionsUseOfAddAndAddAllMeth();
		/* */
		//javaCollectionsExampleMaxMeth();
		/* */
		//javaCollectionsExampleMinMeth1();
		/* */
		javaCollectionsExampleMinMeth2();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JavaCollectionsClass javaCollectionsClass = new JavaCollectionsClass();
		javaCollectionsClass.start();
	}
}
