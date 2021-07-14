package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java8.methodreferences.MethodReferences;
import com.corejava.practice.javapractices.basicsofjava.java8.methodreferences.ReferenceToAConstructor;
import com.corejava.practice.javapractices.basicsofjava.java8.methodreferences.ReferenceToInstanceMethodFromInstance;
import com.corejava.practice.javapractices.basicsofjava.java8.methodreferences.ReferenceToStaticMethod;

/**
 * 
 * @author Administrator
 *
 */
public class TestForMethodReferences {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(ReferenceToStaticMethod.class);
		annotationConfigApplicationContext.register(ReferenceToInstanceMethodFromInstance.class);
		annotationConfigApplicationContext.register(ReferenceToAConstructor.class);
		annotationConfigApplicationContext.register(MethodReferences.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		MethodReferences methodReferences = 
				(MethodReferences)applicationContext.getBean("methodreferences");
		methodReferences.referenceToStaticMethod();

	}

}
