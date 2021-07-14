package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics.GenericClass;
import com.corejava.practice.javapractices.basicsofjava.java8.javatypeinference.UseOfGenericClass;

/**
 * 
 * @author Administrator
 *
 */
public class TestForJavaTypeInferenceImpl {
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(GenericClass.class);
		annotationConfigApplicationContext.register(UseOfGenericClass.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		UseOfGenericClass useOfGenericClass = 
				(UseOfGenericClass)applicationContext.getBean("useofgenericclass");

		/**
		 * 
		 */
		useOfGenericClass.JavaTypeInferenceImpl();

	}

}
