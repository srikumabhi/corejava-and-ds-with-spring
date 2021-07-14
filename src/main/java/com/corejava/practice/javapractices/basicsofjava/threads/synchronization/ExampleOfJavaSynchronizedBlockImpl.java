package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ExampleOfJavaSynchronizedBlockImpl {
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){

		ExampleOfJavaSynchronized exampleOfJavaSynchronized = 
				new ExampleOfJavaSynchronized(); //only one object  

		Thread1forSynchronizedBlock thread1forSynchronizedBlock = 
				new Thread1forSynchronizedBlock(exampleOfJavaSynchronized);  
		Thread2forSynchronizedBlock thread2forSynchronizedBlock = 
				new Thread2forSynchronizedBlock(exampleOfJavaSynchronized); 

		thread1forSynchronizedBlock.setName("Thread1forSynchronizedBlock");
		thread1forSynchronizedBlock.start(); 

		thread2forSynchronizedBlock.setName("Thread2forSynchronizedBlock");
		thread2forSynchronizedBlock.setPriority(Thread.MAX_PRIORITY);
		thread2forSynchronizedBlock.setDaemon(true);
		try {
			thread2forSynchronizedBlock.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2forSynchronizedBlock.start();  
	}
}
