package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.stringjoinmethod.StringJoinMethod;

public class TestForStringJoinMethod {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();
		
		annotationConfigApplicationContext.register(StringJoinMethod.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;
		
		StringJoinMethod stringJoinMethod = 
				(StringJoinMethod)applicationContext.getBean("stringjoinmethod");
		
		stringJoinMethod.StringJoinDemo();
		
	}

}
