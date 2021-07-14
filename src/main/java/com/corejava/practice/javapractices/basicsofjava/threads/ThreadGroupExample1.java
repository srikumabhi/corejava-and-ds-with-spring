package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ThreadGroupExample1 implements Runnable{

	/**
	 * 
	 */
	public void run() {  
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	} 
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ThreadGroupExample1 threadGroupExample1 = new ThreadGroupExample1(); 

		ThreadGroup parentThreadGroup = new ThreadGroup("Parent-ThreadGroup(1st)");  

		Thread thread1 = new Thread(parentThreadGroup, threadGroupExample1,
				"1st-Thread"); 
		thread1.setDaemon(true);
		thread1.start(); 

		Thread thread2 = new Thread(parentThreadGroup, threadGroupExample1,
				"2nd-Thread"); 
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.start(); 

		Thread thread3 = new Thread(parentThreadGroup, threadGroupExample1,
				"3rd-Thread"); 
		try {
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread3.start();  

		System.out.println("Thread Group Name:-"+parentThreadGroup.getName()); 
		System.out.println("Thread Group Parent Name:-"+parentThreadGroup.getParent());
		System.out.println("Thread Group MaxPriority:-"+parentThreadGroup.getMaxPriority());
		/*
		 * list():- Prints information about this thread group to the standard output. 
		 * This method is useful only for debugging.
		 */
		System.out.println("*** Information about Parent-ThreadGroup to the standard output ***");
		parentThreadGroup.list();  

		ThreadGroup childThreadGroup = new ThreadGroup(parentThreadGroup, 
				"Child-ThreadGroup(2nd)");
		childThreadGroup.list();

	}  
}
