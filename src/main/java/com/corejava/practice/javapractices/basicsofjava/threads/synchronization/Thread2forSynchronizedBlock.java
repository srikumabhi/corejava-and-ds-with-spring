package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Thread2forSynchronizedBlock extends Thread{
	
	ExampleOfJavaSynchronized exampleOfJavaSynchronized; 

	Thread2forSynchronizedBlock(ExampleOfJavaSynchronized exampleOfJavaSynchronized){  
		this.exampleOfJavaSynchronized = exampleOfJavaSynchronized;  
	} 

	public void run(){  
		exampleOfJavaSynchronized.synchronizedBlock(5);  
	} 
}
