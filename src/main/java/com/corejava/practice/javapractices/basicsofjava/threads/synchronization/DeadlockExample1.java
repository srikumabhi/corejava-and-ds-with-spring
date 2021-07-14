package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class DeadlockExample1 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {  

		final String resource1 = "Developer1";  
		final String resource2 = "Developer2";  

		// thread1 tries to lock resource1 then resource2  
		Thread thread1 = new Thread() {  
			public void run() {  
				synchronized (resource1) {  
					System.out.println("Thread 1: locked resource 1");  

					try { 
						Thread.sleep(100);
					} catch (Exception e) {}  

					synchronized (resource2) {  
						System.out.println("Thread 1: locked resource 2");  
					}  
				}  
			}  
		};  

		// thread2 tries to lock resource2 then resource1  
		Thread thread2 = new Thread() {  
			public void run() {  
				synchronized (resource2) {  
					System.out.println("Thread 2: locked resource 2");  

					try { 
						Thread.sleep(100);
					} catch (Exception e) {}  

					synchronized (resource1) {  
						System.out.println("Thread 2: locked resource 1");  
					}  
				}  
			}  
		};  

		thread1.start();  
		thread2.start();  
	}  

}
