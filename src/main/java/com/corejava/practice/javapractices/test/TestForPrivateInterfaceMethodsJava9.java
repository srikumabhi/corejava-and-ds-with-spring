package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface.interfaceenhancement.java9.PrivateInterfaceMethodsImpl;

/**
 * 
 * @author Administrator
 *
 */
public class TestForPrivateInterfaceMethodsJava9 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(PrivateInterfaceMethodsImpl	.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		PrivateInterfaceMethodsImpl privateInterfaceMethodsImpl = 
				(PrivateInterfaceMethodsImpl)applicationContext.getBean("privatInterfaceMethodsImpl");

		privateInterfaceMethodsImpl.callThePrivateInterfaceMethods();

	}

}
