package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface.interfaceenhancement.java8;

@FunctionalInterface
public interface InterfaceEnhancementInJava8Example1 {

	void draw(); 
	
	default void msg(){
		System.out.println("msg default method in InterfaceEnhancementInJava8Example1");
	} 
	
	default void show(){
		System.out.println("show default method in InterfaceEnhancementInJava8Example1");
	} 

	static int cube(int x){
		return x*x*x;
	}  

}
