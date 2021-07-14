package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java9.immutablecollectionswithfactorymethods.ImmutableList;
import com.corejava.practice.javapractices.basicsofjava.java9.immutablecollectionswithfactorymethods.ImmutableMap;
import com.corejava.practice.javapractices.basicsofjava.java9.immutablecollectionswithfactorymethods.ImmutableSet;

/**
 * 
 * @author Administrator
 *
 */
public class TestForImmutableCollectionsWithFactoryMethods {

	/**
	 * 
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(ImmutableList.class);
		annotationConfigApplicationContext.register(ImmutableSet.class);
		annotationConfigApplicationContext.register(ImmutableMap.class);

		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		/**
		 * 
		 */
		ImmutableList immutableList = (ImmutableList)applicationContext.getBean("immutableList");
		immutableList.factoryMethodsOfListInterfaceImpl();
		/**
		 * 
		 */
		ImmutableSet immutableSet = (ImmutableSet)applicationContext.getBean("immutableSet");
		immutableSet.factoryMethodsOfSetInterfaceImpl();
		/**
		 * 
		 */
		ImmutableMap immutableMap = (ImmutableMap)applicationContext.getBean("immutableMap");
		immutableMap.factoryMethodsOfMapInterfaceImpl();
	}

}
