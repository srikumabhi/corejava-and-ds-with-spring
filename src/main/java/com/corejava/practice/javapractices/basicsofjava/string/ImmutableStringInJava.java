package com.corejava.practice.javapractices.basicsofjava.string;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ImmutableStringInJava implements Runnable{

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
		
		immutableStringExample1();
		immutableStringExample2();
	}

	/**
	 * 
	 */
	public void immutableStringExample1() {

		String string="Abhishek"; 

		//concat() method appends the string at the end  
		string.concat(" Srivastava"); 

		//will print Abhishek because strings are immutable objects  
		System.out.println(string); 
	}

	/**
	 * 
	 */
	public void immutableStringExample2() {

		String string="Abhishek";  
		string = string.concat(" Srivastava"); 

		System.out.println(string); // Now will print Abhishek Srivastava
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ImmutableStringInJava immutableStringInJava = new ImmutableStringInJava();
		Thread thread = new Thread(immutableStringInJava);
		thread.start();
	}

}
