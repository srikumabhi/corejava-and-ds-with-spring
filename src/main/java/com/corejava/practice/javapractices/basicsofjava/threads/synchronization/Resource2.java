package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

import java.io.IOException;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Resource2 {

	// static variable resource1Instance of type Singleton 
	private static Resource2 resource2Instance = null; 

	// private constructor restricted to this class itself 
	private Resource2() { 
		System.out.println("Resource2 is a Singleton class...");	
	} 

	// static method to create instance of Resource1 class 
	public static Resource2 getInstance() { 
		if (resource2Instance == null) 
			resource2Instance = new Resource2(); 
		return resource2Instance; 
	} 

	/**
	 * Example of synchronized-method  
	 * 
	 * @param n
	 */
	public synchronized void synchronizedMethod2(){

		Runtime runtime = Runtime.getRuntime(); 
		System.out.println("Available Processors: "+
				runtime.availableProcessors());
		try {
			System.out.println(runtime.exec("notepad"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("********** Memory Information **********");
		System.out.println("Total Memory: "+runtime.totalMemory());  
		System.out.println("Free Memory: "+runtime.freeMemory()); 

		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*
		 * 
		 */
		Resource1.getInstance().synchronizedMethod1();
	}
}
