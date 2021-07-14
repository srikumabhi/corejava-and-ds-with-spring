package com.corejava.practice.javapractices.basicsofjava.java8.javatypeinference;

import org.springframework.stereotype.Service;

/**
 * 
 * @author Administrator
 *
 */
@Service("useofgenericclass")
public class UseOfGenericClass {

	/**
	 * 
	 */
	public void JavaTypeInferenceImpl() {
		
		GenericClass<String> genericClass = new GenericClass<>(); 
		
		/**
		 * Java-7
		 */
		String result = genericClass.genericMethod(genericClass);
		System.out.println("result=>"+result);
		
		/**
		 * Java-8
		 */
		String resultAsPerTypeInference = genericClass.genericMethod(new GenericClass<>());
		System.out.println("resultAsPerTypeInference=>"+resultAsPerTypeInference);

	}

}
