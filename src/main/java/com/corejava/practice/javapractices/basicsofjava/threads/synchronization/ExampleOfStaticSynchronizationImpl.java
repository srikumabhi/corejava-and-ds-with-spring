package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ExampleOfStaticSynchronizationImpl {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread1forStaticSynchronization thread1forStaticSynchronization = new 
				Thread1forStaticSynchronization();
		Thread2forStaticSynchronization thread2forStaticSynchronization = new 
				Thread2forStaticSynchronization();

		thread1forStaticSynchronization.setName("Thread1forStaticSynchronization");
		thread1forStaticSynchronization.start();	

		thread2forStaticSynchronization.setDaemon(true);
		thread2forStaticSynchronization.setPriority(Thread.MAX_PRIORITY);
		thread2forStaticSynchronization.setName("Thread2forStaticSynchronization");
		thread2forStaticSynchronization.start();
	}
}
