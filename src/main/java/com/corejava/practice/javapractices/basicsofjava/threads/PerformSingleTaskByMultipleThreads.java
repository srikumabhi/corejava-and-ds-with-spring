package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class PerformSingleTaskByMultipleThreads extends Thread{

	/**
	 * 
	 */
	public void run(){  
		System.out.println("task one");  
	} 

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){  

		PerformSingleTaskByMultipleThreads thread1 = 
				new PerformSingleTaskByMultipleThreads();  
		PerformSingleTaskByMultipleThreads thread2 = 
				new PerformSingleTaskByMultipleThreads();  
		PerformSingleTaskByMultipleThreads thread3 = 
				new PerformSingleTaskByMultipleThreads();  

		thread1.start();  
		thread2.start();  
		thread3.start();  
	}
}
