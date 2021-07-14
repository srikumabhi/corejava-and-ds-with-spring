package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.exceptionhandling.java7.trywithresource.CustomResource;
import com.corejava.practice.javapractices.basicsofjava.exceptionhandling.java7.trywithresource.TryWithResources;

/**
 * 
 * @author Administrator
 *
 */
public class TestTryWithResources {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(TryWithResources.class);
		annotationConfigApplicationContext.register(CustomResource.class);

		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		TryWithResources tryWithResources = 
				(TryWithResources)applicationContext.getBean("trywithresources");

		CustomResource customResource = 
				(CustomResource)applicationContext.getBean("customresource");

		/**
		 * 
		 */
		tryWithResources.tryWithResourcesImpl();

		/**
		 * 
		 */
		customResource.customResourceImpl();

	}

}
