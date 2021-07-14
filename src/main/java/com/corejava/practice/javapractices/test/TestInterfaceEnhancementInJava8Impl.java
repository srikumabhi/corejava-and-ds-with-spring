package com.corejava.practice.javapractices.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface.interfaceenhancement.java8.InterfaceEnhancementInJava8Impl;

public class TestInterfaceEnhancementInJava8Impl {
	
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext();
		
		annotationConfigApplicationContext.register(InterfaceEnhancementInJava8Impl.class);
		annotationConfigApplicationContext.refresh();
		ApplicationContext applicationContext = annotationConfigApplicationContext;
		
		InterfaceEnhancementInJava8Impl interfaceEnhancementInJava8Impl = 
				(InterfaceEnhancementInJava8Impl)applicationContext.getBean("interfaceEnhancementInJava8Impl");
		
		interfaceEnhancementInJava8Impl.msg();
		interfaceEnhancementInJava8Impl.show();
		
	}

}
