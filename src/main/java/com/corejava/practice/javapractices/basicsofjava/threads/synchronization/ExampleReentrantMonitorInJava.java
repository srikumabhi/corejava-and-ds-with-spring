package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ExampleReentrantMonitorInJava implements Runnable{
	
	@Override
	public void run() {
		Resource1.getInstance().testForReentrantMonitorMeth1();
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExampleReentrantMonitorInJava exampleReentrantMonitorInJava = new 
				ExampleReentrantMonitorInJava();
		Thread thread = new Thread(exampleReentrantMonitorInJava);
		thread.start();
	}
	
}
