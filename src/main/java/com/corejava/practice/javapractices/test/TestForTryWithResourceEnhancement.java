package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.java9.trywithresourceenhancement.TryWithResourceEnhancement;
import com.corejava.practice.javapractices.basicsofjava.java9.trywithresourceenhancement.TryWithResourceEnhancementImpl;

public class TestForTryWithResourceEnhancement {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(TryWithResourceEnhancement.class);
		annotationConfigApplicationContext.register(TryWithResourceEnhancementImpl.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;

		TryWithResourceEnhancementImpl tryWithResourceEnhancementImpl = 
				(TryWithResourceEnhancementImpl)applicationContext.getBean("trywithresourceenhancementimpl");

		tryWithResourceEnhancementImpl.tryWithResourceEnhancementImplInJava9();

	}

}
