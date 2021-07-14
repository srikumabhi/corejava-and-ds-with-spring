package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.predicate.DemoEmployeePredicates;

public class TestForPredicates {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(DemoEmployeePredicates.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		DemoEmployeePredicates demoEmployeePredicates = 
				(DemoEmployeePredicates)applicationContext.getBean("demoemployeepredicates");

		demoEmployeePredicates.testEmployeePredicates();

	}

}
