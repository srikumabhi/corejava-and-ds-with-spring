package com.corejava.practice.javapractices.basicsofjava.java8.methodreferences;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component("methodreferences")
public class MethodReferences {

	@Autowired
	public ReferenceToStaticMethod referenceToStaticMethod;

	@Autowired
	public ReferenceToInstanceMethodFromInstance referenceToInstanceMethodFromInstance;
	
	@Autowired
	public ReferenceToAConstructor referenceToAConstructor;

	/**
	 * 
	 */
	public void  referenceToInstanceMethodFromInstance(){

	}

	/**
	 * 
	 */
	public void  referenceToStaticMethod(){

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		/**
		 * 
		 */
		referenceToStaticMethod.referenceToStaticMethodImpl1();

		/**
		 * 
		 */
		referenceToStaticMethod.referenceToStaticMethodImpl2();

		/**
		 * 
		 */
		referenceToStaticMethod.referenceToStaticMethodImpl3();

		/**
		 * 
		 */
		referenceToStaticMethod.referenceToStaticMethodImpl4();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		/**
		 * 
		 */
		referenceToInstanceMethodFromInstance.referenceToInstanceMethodFromInstanceImpl1();

		/**
		 * 
		 */
		referenceToInstanceMethodFromInstance.referenceToInstanceMethodFromInstanceImpl2();

		/**
		 * 
		 */
		referenceToInstanceMethodFromInstance.referenceToInstanceMethodFromInstanceImpl3();

		/**
		 * 
		 */
		referenceToInstanceMethodFromInstance.referenceToInstanceMethodFromInstanceImpl4();

		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		/**
		 * 
		 */
		referenceToAConstructor.ReferenceToAConstructorImpl1();
	}

}
