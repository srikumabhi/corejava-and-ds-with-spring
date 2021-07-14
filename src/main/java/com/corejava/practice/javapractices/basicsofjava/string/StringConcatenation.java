package com.corejava.practice.javapractices.basicsofjava.string;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class StringConcatenation<T> implements Runnable{

	/**
	 * If the superclass method does not declare an exception:-
	 * If the superclass method does not declare an exception, subclass 
	 * overridden method cannot declare the checked exception 
	 * but it can declare unchecked exception.
	 */
	@Override
	public void run() throws RuntimeException{
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
		
		StringConcatenation<String> stringConcatenation = new StringConcatenation<String>();
		stringConcatenation.stringConcatenationByConcatenationOperator("Abhishek");
		stringConcatenation.stringConcatenationByConcatMethod("Abhishek");
	}

	/**
	 * 
	 * @param <E>
	 * @param element
	 */
	public void stringConcatenationByConcatenationOperator(T element){
		String string = "Abhishek"+" Srivastava"; 
		System.out.println(string); //Abhishek Srivastava 

		String stringWithPrimitiveValues = (50+30+"Rinshu"+40+40);
		/*
		 * After a string literal, all the + will be treated as string concatenation 
		 * operator.
		 * Output will be:- 80Rinshu4040  
		 */
		System.out.println(stringWithPrimitiveValues); 
	}

	/**
	 * 
	 * @param <E>
	 * @param element
	 */
	public void stringConcatenationByConcatMethod(T element) {
		String string1 = "Abhishek ";  
		String string2 = "Srivastava"; 

		String string3 = string1.concat(string2);

		System.out.println(string3); //Abhishek Srivastava  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new StringConcatenation<String>());

		thread.setName("StringConcatenation");
		thread.setPriority(Thread.MAX_PRIORITY);
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread.start();
	}
	
}
