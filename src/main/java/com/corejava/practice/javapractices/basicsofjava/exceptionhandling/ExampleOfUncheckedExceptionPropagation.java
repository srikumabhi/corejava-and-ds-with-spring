package com.corejava.practice.javapractices.basicsofjava.exceptionhandling;

/**
 * Java Exception propagation:-
 *   An exception is first thrown from the top of the stack and if it is 
 *   not caught, it drops down the call stack to the previous method, If 
 *   not caught there, the exception again drops down to the previous method, 
 *   and so on until they are caught or until they reach the very bottom 
 *   of the call stack.This is called exception propagation.
 *  
 *  By default Unchecked Exceptions are forwarded in calling chain 
 *  (propagated).
 *  
 *  In the above example exception occurs in method1() method where it is not 
 *  handled,so it is propagated to previous method2() method where it is not 
 *  handled, again it is propagated to method3() method where exception is 
 *  handled.
 *  Exception can be handled in any method in call stack either in main() 
 *  method, method3() method, method2() method or method1() method.
 *  
 * @author abhishek-sriv
 */
public class ExampleOfUncheckedExceptionPropagation {

	public void method1(){  
		int nullPointerExecption = 50/0;  
	}

	public void method2(){  
		method1();  
	} 

	public void method3(){  
		try{  
			method2();  
		}catch(NullPointerException ex){
			// System.out.println(ex+" Exception handled...");
			System.out.println("NullPointerException handled...");
		}  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExampleOfUncheckedExceptionPropagation exampleOfUncheckedExceptionPropagation 
		= new ExampleOfUncheckedExceptionPropagation();

		try{
			exampleOfUncheckedExceptionPropagation.method3();
		} catch (Exception ex) {
			System.out.println("Exception handled...");
		}
		System.out.println("Normal flow..."); 
	}

}
