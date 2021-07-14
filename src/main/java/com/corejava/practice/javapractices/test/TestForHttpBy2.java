package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java9.httpby2.HttpBy2;

/**
 * 
 * @author Administrator
 *
 */
public class TestForHttpBy2 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(HttpBy2.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		HttpBy2 httpBy2 = (HttpBy2)applicationContext.getBean("httpby2");

		/**
		 * 
		 */
		//httpBy2.HttpBy2Impl();

	}

}
