package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class GarbageCollectionExample1 {

	/**
	 * 
	 */
	public void finalize(){
		System.out.println("object is garbage collected");
	}  

	public void show() {
		System.out.println("Show method of GarbageCollectionExample1 class");
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){

		GarbageCollectionExample1 garbageCollection1 = 
				new GarbageCollectionExample1();  
		GarbageCollectionExample1 garbageCollection2 = 
				new GarbageCollectionExample1();
		GarbageCollectionExample1 garbageCollection3 = 
				new GarbageCollectionExample1();
		garbageCollection3.show();

		garbageCollection1 = null;  
		//garbageCollection2=null;  
		//garbageCollection3=null;

		System.gc();  
	}  
}
