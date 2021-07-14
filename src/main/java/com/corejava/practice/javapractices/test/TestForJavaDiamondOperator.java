package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.generics.java7.diamondoperator.JavaDiamondOperator;

/**
 * @author abhishek-sriv
 *
 */
public class TestForJavaDiamondOperator {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
		new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(JavaDiamondOperator.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		JavaDiamondOperator javaDiamondOperator = 
				(JavaDiamondOperator)applicationContext.getBean("javadiamondoperator");

		/**
		 * 
		 */
		javaDiamondOperator.javaDiamondOperatorExample();

	}

}
