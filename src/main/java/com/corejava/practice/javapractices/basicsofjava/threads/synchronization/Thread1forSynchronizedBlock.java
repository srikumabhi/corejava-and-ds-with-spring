package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Thread1forSynchronizedBlock extends Thread{

	ExampleOfJavaSynchronized exampleOfJavaSynchronized; 

	Thread1forSynchronizedBlock(ExampleOfJavaSynchronized exampleOfJavaSynchronized){  
		this.exampleOfJavaSynchronized = exampleOfJavaSynchronized;  
	} 

	public void run(){  
		exampleOfJavaSynchronized.synchronizedBlock(5);  
	} 
}
