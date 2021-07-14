package com.corejava.practice.javapractices.basicsofjava.string;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaStringClassMethods implements Runnable{

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

		javaStringMethodsToUpperCaseAndToLowerCase();
		javaStringTrimMethod();
		javaStringMethodsStartsWithAndEndsWith();
		javaStringCharAtMethod();
		javaStringLengthMethod();
		javaStringInternMethod();
		javaStringValueOfMethod();
		javaStringReplaceMethod();
	}

	/**
	 * 
	 */
	public void javaStringMethodsToUpperCaseAndToLowerCase(){
	}

	/**
	 * 
	 */
	public void javaStringTrimMethod(){
	}

	/**
	 * 
	 */
	public void javaStringMethodsStartsWithAndEndsWith(){
	}

	/**
	 * 
	 */
	public void javaStringCharAtMethod(){	
	}

	/**
	 * 
	 */
	public void javaStringLengthMethod(){
	}

	/**
	 * 
	 */
	public void javaStringInternMethod() {
	}

	/**
	 * 
	 */
	public void javaStringValueOfMethod(){
	}

	/**
	 * 
	 */
	public void javaStringReplaceMethod(){
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new JavaStringClassMethods());

		thread.setName("Abhishek");
		thread.setPriority(Thread.MAX_PRIORITY);
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.start();
	}
}
