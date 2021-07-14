package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.exceptionhandling.java7.improvedcatchblock.ImprovedCatchBlockInJava7;
import com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics.GenericsExample;
import com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics.MechanicForPolymorphismWithGenerics;
import com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics.TheWildcardOperator;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestImprovedCatchBlockInJava7 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
		new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(ImprovedCatchBlockInJava7.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		ImprovedCatchBlockInJava7 improvedCatchBlockInJava7 = 
				(ImprovedCatchBlockInJava7)applicationContext.getBean("improvedcatchblockinjava7");

		/**
		 * 
		 */
		improvedCatchBlockInJava7.improvedCatchBlockInJava7Impl();

	}
}
