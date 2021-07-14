package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression.JavaLambdaExpression;

public class TestForLambdaExpression {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(JavaLambdaExpression.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		JavaLambdaExpression javaLambdaExpression = 
				(JavaLambdaExpression)applicationContext.getBean("javalambdaexpression");

		javaLambdaExpression.javaLambdaExpressionExample();

	}

}
