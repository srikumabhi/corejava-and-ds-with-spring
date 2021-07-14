package com.corejava.practice.javapractices.basicsofjava.java8.methodreferences;

import java.util.function.BiFunction;

import org.springframework.stereotype.Component;

@Component
public class ReferenceToInstanceMethodFromInstance {

	/**
	 * 
	 */
	public void saySomething(){  

		System.out.println("Hello, this is non-static method."
				+ "Implementation of Reference To InstanceMethod From Instance");  
	} 

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b){  
		return a+b;  
	}  

	/**
	 * 
	 */
	public void referenceToInstanceMethodFromInstanceImpl1(){

		/**
		 * Creating object  
		 */
		ReferenceToInstanceMethodFromInstance referenceToInstanceMethodFromInstance = 
				new ReferenceToInstanceMethodFromInstance(); 

		/**
		 * Referring non-static method using reference.  
		 */
		Sayable sayable = referenceToInstanceMethodFromInstance::saySomething;  

		/**
		 *  Calling interface method  
		 */
		sayable.say(); 

	}

	/**
	 * You can use anonymous object also calling interface method.  
	 */
	public void referenceToInstanceMethodFromInstanceImpl2(){

		/**
		 * Referring non-static method using reference  
		 */
		Sayable sayable = new ReferenceToInstanceMethodFromInstance()::saySomething;  

		/**
		 *  Calling interface method  
		 */
		sayable.say(); 

	}

	/**
	 * You can use anonymous object also calling interface method.  
	 */
	public void referenceToInstanceMethodFromInstanceImpl3(){

		/**
		 * 
		 */
		Thread thread=new Thread(new ReferenceToInstanceMethodFromInstance()::saySomething);  
		thread.start();     

	}

	/**
	 * You can use anonymous object also calling interface method.  
	 */
	public void referenceToInstanceMethodFromInstanceImpl4(){

		/**
		 * 
		 */
		BiFunction<Integer, Integer, Integer>biFunction = new ReferenceToInstanceMethodFromInstance()::add;  
		int resultOfBiFunction = biFunction.apply(10, 20);  
		System.out.println(resultOfBiFunction);   

	}

}
