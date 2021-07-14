package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ExampleOfJavaSynchronizedMethodImpl {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){

		ExampleOfJavaSynchronized exampleOfJavaSynchronized = 
				new ExampleOfJavaSynchronized(); //only one object  

		Thread1forSynchronizedMethod thread1forSynchronizedMethod = 
				new Thread1forSynchronizedMethod(exampleOfJavaSynchronized);  
		Thread2forSynchronizedMethod thread2forSynchronizedMethod = 
				new Thread2forSynchronizedMethod(exampleOfJavaSynchronized); 

		thread1forSynchronizedMethod.start();  
		thread2forSynchronizedMethod.start();  
	}

}
