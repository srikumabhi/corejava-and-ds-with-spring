package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.javaparallelarraysorting.JavaParallelArraySorting;
import com.corejava.practice.javapractices.basicsofjava.java8.javaparallelarraysorting.JavaParallelArraySortingImpl;

public class TestForJavaParallelArraySorting {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(JavaParallelArraySorting.class);
		annotationConfigApplicationContext.register(JavaParallelArraySortingImpl.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		JavaParallelArraySortingImpl javaParallelArraySortingImpl = 
				(JavaParallelArraySortingImpl)applicationContext.getBean("javaparallelarraysortingImpl");

		/**
		 * 
		 */
		javaParallelArraySortingImpl.JavaParallelArraySortingImplExa();

	}

}
