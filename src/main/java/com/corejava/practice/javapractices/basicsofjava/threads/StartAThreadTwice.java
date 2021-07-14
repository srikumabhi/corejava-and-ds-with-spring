package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class StartAThreadTwice extends Thread {

	public void run() {
		System.out.println("Abhishek Kumar Srivastava");
	}

	public static void main(String[] args) {
		StartAThreadTwice startAThreadTwice = new 
				StartAThreadTwice();
		Thread thread1 = new Thread(startAThreadTwice);
		thread1.start();

		//Start thread1 Thread twice
		thread1.start(); // Exception in thread "main" java.lang.IllegalThreadStateException
	}
}
