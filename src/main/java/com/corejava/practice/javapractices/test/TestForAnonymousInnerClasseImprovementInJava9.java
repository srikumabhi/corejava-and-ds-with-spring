package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java9.anonymousinnerclassesimprovement.AnonymousInnerClasseImprovement;

/**
 * 
 * @author Administrator
 *
 */
public class TestForAnonymousInnerClasseImprovementInJava9 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(AnonymousInnerClasseImprovement.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		AnonymousInnerClasseImprovement anonymousInnerClasseImprovement = 
				(AnonymousInnerClasseImprovement)applicationContext.getBean("anonymousInnerClasseImprovement");

		/**
		 * 
		 */
		anonymousInnerClasseImprovement.anonymousInnerClasseImprovementImplExample1();

		/**
		 * 
		 */
		anonymousInnerClasseImprovement.anonymousInnerClasseImprovementImplExample2();

	}

}
