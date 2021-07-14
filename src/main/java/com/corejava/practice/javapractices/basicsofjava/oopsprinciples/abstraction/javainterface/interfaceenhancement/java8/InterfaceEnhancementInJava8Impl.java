package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface.interfaceenhancement.java8;

import org.springframework.stereotype.Component;

@Component("interfaceEnhancementInJava8Impl")
public class InterfaceEnhancementInJava8Impl implements InterfaceEnhancementInJava8Example1,
InterfaceEnhancementInJava8Example2 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		InterfaceEnhancementInJava8Example2.super.msg();
		System.out.println("test");
	}

	public static void main(String[] args) {
		new InterfaceEnhancementInJava8Impl().msg();
	}

}
