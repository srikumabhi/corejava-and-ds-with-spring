package com.corejava.practice.javapractices.basicsofjava.java8.methodreferences;

import java.util.function.BiFunction;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component
public class ReferenceToStaticMethod {

	/**
	 * I have defined a functional interface and referring a static method to it's functional method say().
	 */
	public static void saySomething(){
		System.out.println("Hello, this is static method."); 
	}  

	public void referenceToStaticMethodImpl1(){ 
		// Referring static method  
		Sayable sayable = ReferenceToStaticMethod::saySomething; 

		// Calling interface method  
		sayable.say();  
	}  

	/**
	 * I am using predefined functional interface Runnable to refer static method.
	 */
	public static void ThreadStatus(){  
		System.out.println("Thread is running...");  
	}  

	public void referenceToStaticMethodImpl2(){  
		Thread threadObject = new Thread(ReferenceToStaticMethod::ThreadStatus);  
		threadObject.start();       
	} 

	/**
	 * Using these three override static methods in referenceToStaticMethodImpl3 and referenceToStaticMethodImpl4 methods
	 * for implementation of reference to static-method. 
	 */

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int add(int a, int b){  
		return a+b;  
	} 

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static float add(int a, float b){  
		return a+b;  
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static float add(float a, float b){  
		return a+b;  
	} 

	/**
	 * I am using BiFunction interface and using it's apply() method.
	 */
	public void referenceToStaticMethodImpl3() {  
		BiFunction<Integer, Integer, Integer>biFunction = ReferenceToStaticMethod::add;  
		int result = biFunction.apply(10, 20);  
		System.out.println(result);  
	}  

	/**
	 * We can also override static methods by referring methods. 
	 * In the following example, I have defined and overloaded three add methods.
	 */
	public void referenceToStaticMethodImpl4(){  

		BiFunction<Integer, Integer, Integer>biFunction1 = ReferenceToStaticMethod::add;  
		BiFunction<Integer, Float, Float>biFunction2 = ReferenceToStaticMethod::add;  
		BiFunction<Float, Float, Float>biFunction3 = ReferenceToStaticMethod::add;  

		int resultOfBiFunction1 = biFunction1.apply(10, 20);  
		float resultOfBiFunction2 = biFunction2.apply(10, 20.0f);  
		float resultOfBiFunction3 = biFunction3.apply(10.0f, 20.0f);  

		System.out.println(resultOfBiFunction1);  
		System.out.println(resultOfBiFunction2);  
		System.out.println(resultOfBiFunction3); 

	}  

}
