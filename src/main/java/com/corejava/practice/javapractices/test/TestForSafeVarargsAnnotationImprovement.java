package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java9.safevarargsannotationimprovement.SafeVarargsAnnotationImprovement;

/**
 * 
 * @author Administrator
 *
 */
public class TestForSafeVarargsAnnotationImprovement {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(SafeVarargsAnnotationImprovement.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		SafeVarargsAnnotationImprovement safeVarargsAnnotationImprovement = 
				(SafeVarargsAnnotationImprovement)applicationContext.getBean("safeVarargsAnnotationImprovement");

		safeVarargsAnnotationImprovement.safeVarargsAnnotationPrivateInstanceMethodImpl();

	}

}
