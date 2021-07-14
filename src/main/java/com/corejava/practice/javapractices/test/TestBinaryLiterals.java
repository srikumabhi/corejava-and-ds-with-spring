package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java7.binaryliterals.BinaryLiterals;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestBinaryLiterals {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(BinaryLiterals.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		BinaryLiterals binaryLiterals = 
				(BinaryLiterals)applicationContext.getBean("binaryliterals");

		/**
		 * 
		 */
		binaryLiterals.BinaryLiteralsExample1();

		/**
		 * 
		 */
		binaryLiterals.BinaryLiteralsExample2();

	}

}
