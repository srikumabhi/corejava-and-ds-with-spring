package com.corejava.practice.javapractices.basicsofjava.string;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Substring implements Runnable{

	@Override
	public void run() {
		System.out.println("@@@@@@@@@@ InformationAboutCurrentThread @@@@@@@@@@");
		System.out.println("Id:-"+Thread.currentThread().getId());
		System.out.println("Name:-"+Thread.currentThread().getName());
		System.out.println("Priority:-"+Thread.currentThread().getPriority());
		System.out.println("Class:-"+Thread.currentThread().getClass());
		System.out.println("ContextClassLoader:-"+Thread.currentThread().getContextClassLoader());
		System.out.println("StackTrace:-"+Thread.currentThread().getStackTrace());
		System.out.println("State:-"+Thread.currentThread().getState());
		System.out.println("ThreadGroup:-"+Thread.currentThread().getThreadGroup());
		System.out.println("UncaughtExceptionHandler:-"+Thread.currentThread().getUncaughtExceptionHandler());
		
		Substring substring = new Substring();
		substring.substringExample1();
	}

	/**
	 * 
	 */
	public void substringExample1() {
		String s="AbhishekSrivastava";
		String s1="hello";
		//System.out.println(s.substring(8));
		System.out.println(s.substring(4, 8)); 
		System.out.println(s1.substring(0, 2));
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new Substring());
		thread.setName("Substring");
		thread.setPriority(Thread.MAX_PRIORITY);
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.start();
	}
}
