package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface.interfaceenhancement.java8;

@FunctionalInterface
public interface InterfaceEnhancementInJava8Example2 {

	void draw(); 

	default void msg(){
		System.out.println("default method in InterfaceEnhancementInJava8Example2");
	}  

	static int cube(int x){
		return x*x*x;
	}  

}
