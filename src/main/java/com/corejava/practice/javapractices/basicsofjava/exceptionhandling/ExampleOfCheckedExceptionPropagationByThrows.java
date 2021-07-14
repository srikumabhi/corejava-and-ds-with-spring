package com.corejava.practice.javapractices.basicsofjava.exceptionhandling;

import java.io.IOException;

/**
 * By default, Checked Exceptions are not forwarded in calling chain 
 * (propagated).
 * 
 * @author abhishek-sriv
 */
public class ExampleOfCheckedExceptionPropagationByThrows {

	public void method1() throws IOException {  
		//checked exception
		throw new java.io.IOException("device error...");  
	}

	public void method2() throws IOException{  
		method1();  
	} 

	public void method3() throws IOException{
		try {
			method2();  
		} catch (Exception ex) {
			//System.out.println(ex+" Exception handled...");
			System.out.println("IOException handled...");
		}
	}

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		ExampleOfCheckedExceptionPropagationByThrows exampleOfCheckedExceptionPropagationByThrows 
		= new ExampleOfCheckedExceptionPropagationByThrows();

		try {
			exampleOfCheckedExceptionPropagationByThrows.method3();
		} catch (Exception ex) {
			System.out.println("Exception handled...");
		}
		System.out.println("Normal flow..."); 
	}
}
