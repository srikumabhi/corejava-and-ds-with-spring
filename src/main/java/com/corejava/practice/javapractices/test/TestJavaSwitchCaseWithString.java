package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.controlstatements.java7.switchcasewithstring.JavaSwitchCaseWithString;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestJavaSwitchCaseWithString {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
		new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(JavaSwitchCaseWithString.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		JavaSwitchCaseWithString javaSwitchCaseWithString = 
				(JavaSwitchCaseWithString)applicationContext.getBean("javaswitchcasewithstring");

		/**
		 * 
		 */
		javaSwitchCaseWithString.switchCaseWithString("one");

		/**
		 * 
		 */
		javaSwitchCaseWithString.switchCaseHandleMultipleConditions("two");

	}

}
