package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class DeadlockExample2 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread1forDeadlockExample2 thread1 = new 
				Thread1forDeadlockExample2(Resource1.getInstance());

		Thread2forDeadlockExample2 thread2 = new 
				Thread2forDeadlockExample2(Resource2.getInstance());

		thread1.start();
		thread2.start();
	}
}
