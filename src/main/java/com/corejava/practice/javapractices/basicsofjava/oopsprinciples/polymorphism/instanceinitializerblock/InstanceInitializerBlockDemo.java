package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.instanceinitializerblock;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class InstanceInitializerBlockDemo {

	public static String developerWorkShop;

	/* First static initialization block */
	static {
		System.out.println("In first static block in InstanceInitializerBlockDemo class.");
	}

	public InstanceInitializerBlockDemo() throws Exception {
		System.out.println("InstanceInitializerBlockDemo class defult/no-argument "
				+ "constructor");
	}
}
