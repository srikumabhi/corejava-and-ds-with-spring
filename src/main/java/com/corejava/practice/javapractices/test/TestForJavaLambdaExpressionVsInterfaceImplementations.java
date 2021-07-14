package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression.JavaLambdaExpressionVsInterfaceImplementations;

/**
 * 
 * @author Administrator
 *
 */
public class TestForJavaLambdaExpressionVsInterfaceImplementations {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
		new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(JavaLambdaExpressionVsInterfaceImplementations.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		JavaLambdaExpressionVsInterfaceImplementations javaLambdaExpressionVsInterfaceImplementations = 
				(JavaLambdaExpressionVsInterfaceImplementations)applicationContext.getBean(
						"javalambdaexpressionvsinterfaceimplementations");

		javaLambdaExpressionVsInterfaceImplementations.javaLambdaExpressionVsInterfaceImplementationsImpl();

	}

}
