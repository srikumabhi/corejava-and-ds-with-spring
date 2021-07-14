package com.corejava.practice.javapractices.basicsofjava.string;

/**
 * We can compare string in java on the basis of content and reference.
 * It is used in authentication (by equals() method), sorting 
 * (by compareTo() method), reference matching (by == operator) etc. 
 * There are three ways to compare string in java:-
 *  By equals() method
 *  By = = operator
 *  By compareTo() method
 *  
 * @author abhishek-sriv
 */
public class JavaStringCompare<E> implements Runnable{

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

		stringCompareByEqualsMethod();
		stringCompareByEqualityOperator();
		stringCompareByCompareToMethod();
	}

	/** 
	 * Sorting (by compareTo() method):-
	 * The String compareTo() method compares values lexicographically 
	 * and returns an integer value that describes if first string is 
	 * less than, equal to or greater than second string.
	 * Suppose s1 and s2 are two string variables. If:
	 *  s1 == s2 :- 0 
	 *  s1 > s2  :- positive value
	 *  s1 < s2  :- negative value
	 */
	public void stringCompareByCompareToMethod() {
		System.out.println(Thread.currentThread().getName());

		String string1="Abhishek";  
		String string2="Abhishek";  
		String string3="Rinshu";

		//0 Reference Matching
		System.out.println(string1.compareTo(string2)); 

		//1(because string1>string3)  
		System.out.println(string1.compareTo(string3));

		//-1(because string3<string1)
		System.out.println(string3.compareTo(string1));  
	}

	/**
	 * Reference Matching (by == operator):-
	 * The = = operator compares references not values.
	 */
	public void stringCompareByEqualityOperator() {
		System.out.println(Thread.currentThread().getName());

		String string1 = "Rinshu";  
		String string2 = "Rinshu";  
		String string3 = new String("Rinshu"); 
		String string4 = "RINSHU";

		//true (because both refer to same instance)  
		System.out.println(string1==string2);
		//false(because s3 refers to instance created in nonpool)  
		System.out.println(string1==string3);
		//false 
		System.out.println(string1==string4);
	}

	/**
	 * Authentication (by equals() method):-
	 * The String equals() method compares the original content of the 
	 * string. It compares values of string for equality. String class 
	 * provides two methods:-
	 *  public boolean equals(Object another) compares this string to 
	 *  the specified object.
	 *  public boolean equalsIgnoreCase(String another) compares this 
	 *  String to another string, ignoring case.
	 */
	public void stringCompareByEqualsMethod(){
		System.out.println(Thread.currentThread().getName());

		String string1 = "Abhishek";  
		String string2 = "Rinshu";  
		String string3 = new String("Abhishek");  
		String string4 ="ABHISHEK"; 

		System.out.println(string1.equals(string2)); //false  
		System.out.println(string1.equals(string3)); //true  
		System.out.println(string1.equals(string4)); //false 
		System.out.println(string1.equalsIgnoreCase(string4)); //true  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new JavaStringCompare<String>());

		thread.setName("JavaStringCompare");
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.setPriority(Thread.MAX_PRIORITY);

		thread.start();
	}

}
