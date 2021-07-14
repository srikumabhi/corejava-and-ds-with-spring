package com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component("javalambdaexpressionexamplemultipleparameters")
public class JavaLambdaExpressionExampleMultipleParameters {

	@FunctionalInterface //It is optional 
	interface Addable {  
		int addable(int a, int b);  
	} 
	public void javaLambdaExpressionExample1MultipleParameters() {
		// Multiple parameters in lambda expression  
		Addable addable1 = (a, b)->(a+b);  
		System.out.println(addable1.addable(10, 20));  

		// Multiple parameters with data type in lambda expression  
		Addable addable2 = (int a, int b)->(a+b);  
		System.out.println(addable2.addable(100, 200));

		// Lambda expression with return keyword.    
		Addable addable3 = (int a, int b)-> {  
			return (a+b);   
		};  
		System.out.println(addable3.addable(1000, 2000)); 

		// Multiple parameters in lambda expression  
		Addable addable4 = (a, b)-> (a+b);  
		System.out.println(addable4.addable(10, 20));  

	} 

	interface Sayable{    
		// default method    
		default void say(){    
			System.out.println("Hello, this is default method");    
		}    
		// Abstract method    
		void sayMore(String msg);    
		// static method    
		static void sayLouder(String msg){    
			System.out.println(msg);    
		}    
	} 

}

