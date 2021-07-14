package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Thread1forSynchronizedMethod extends Thread{  

	ExampleOfJavaSynchronized exampleOfJavaSynchronized; 

	Thread1forSynchronizedMethod(ExampleOfJavaSynchronized exampleOfJavaSynchronized){  
		this.exampleOfJavaSynchronized = exampleOfJavaSynchronized;  
	} 

	public void run(){  
		exampleOfJavaSynchronized.synchronizedMethod(5);  
	}  

}
