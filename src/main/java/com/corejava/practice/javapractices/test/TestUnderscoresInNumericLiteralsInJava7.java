package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java7.numericliteralswithunderscore.UnderscoresInNumericLiteralsInJava7;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestUnderscoresInNumericLiteralsInJava7 {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(UnderscoresInNumericLiteralsInJava7.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		UnderscoresInNumericLiteralsInJava7 underscoresInNumericLiteralsInJava7 = 
				(UnderscoresInNumericLiteralsInJava7)applicationContext.getBean("underscoresinnumericliteralsinJava7");

		/**
		 * 
		 */
		underscoresInNumericLiteralsInJava7.underscoreInNumericLiteralExample();

	}

}
