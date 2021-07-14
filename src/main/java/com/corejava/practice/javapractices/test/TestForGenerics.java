package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics.GenericsExample;
import com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics.MechanicForPolymorphismWithGenerics;
import com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics.TheWildcardOperator;

/**
 * 
 * @author Administrator
 *
 */
public class TestForGenerics {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(MechanicForPolymorphismWithGenerics.class);
		annotationConfigApplicationContext.register(TheWildcardOperator.class);
		annotationConfigApplicationContext.register(GenericsExample.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		GenericsExample genericsExample = 
				(GenericsExample)applicationContext.getBean("genericsexample");

		/**
		 * 
		 */
		genericsExample.polymorphismWithGenericsImpl();

		/**
		 * 
		 */
		genericsExample.theWildcardOperatorImpl();

	}

}
