package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Thread2forSynchronizedMethod extends Thread{
	
	ExampleOfJavaSynchronized exampleOfJavaSynchronized; 

	Thread2forSynchronizedMethod(ExampleOfJavaSynchronized exampleOfJavaSynchronized){  
		this.exampleOfJavaSynchronized = exampleOfJavaSynchronized;  
	} 

	public void run(){  
		exampleOfJavaSynchronized.synchronizedMethod(100);  
	}  
}
