package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Resource1 {

	// static variable resource1Instance of type Singleton 
	private static Resource1 resource1Instance = null; 

	// private constructor restricted to this class itself 
	private Resource1() { 
		System.out.println("Resource1 is a Singleton class...");	
	} 

	// static method to create instance of Resource1 class 
	public static Resource1 getInstance() { 
		if (resource1Instance == null) 
			resource1Instance = new Resource1(); 
		return resource1Instance; 
	} 

	/* */
	public synchronized void testForReentrantMonitorMeth1() {
		System.out.println("Test for ReentrantMonitor 1st Method");
		testForReentrantMonitorMeth2();
	}
	/* */
	public synchronized void testForReentrantMonitorMeth2() {
		System.out.println("Test for ReentrantMonitor 2nd Method");
	}

	/**
	 * Example of synchronized-method  
	 * 
	 * @param n
	 */
	public synchronized void synchronizedMethod1(){
		for(int i=1; i<=10; i++){

			System.out.println(5*i);

			try{  
				Thread.sleep(500);  
			}catch(Exception ex){
				System.out.println(ex);
			}  
		}
		/*
		 * 
		 */
		Resource2.getInstance().synchronizedMethod2();
	}
}
