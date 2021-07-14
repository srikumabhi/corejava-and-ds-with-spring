package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.statickeyword.ChildOfStaticMethodOrClassMethod;
import com.corejava.practice.javapractices.basicsofjava.statickeyword.StaticMethodOrClassMethod;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestChildOfStaticMethodOrClassMethod {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
		new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(
				ChildOfStaticMethodOrClassMethod.class);
		annotationConfigApplicationContext.register(
				StaticMethodOrClassMethod.class);

		annotationConfigApplicationContext.refresh();

		ApplicationContext applicationContext = annotationConfigApplicationContext;

		ChildOfStaticMethodOrClassMethod childOfStaticMethodOrClassMethod = 
				(ChildOfStaticMethodOrClassMethod)applicationContext.getBean(
						"childofstaticmethodorclassmethod");
		StaticMethodOrClassMethod staticMethodOrClassMethod = 
				(StaticMethodOrClassMethod)applicationContext.getBean(
						"staticmethodorclassmethod");
		/**
		 * 
		 */
		//childOfStaticMethodOrClassMethod.childOfStaticMethodOrClassMethodImpl();

	}

}
