package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation.testjavapackage;

/* 
 * Using packagename.classname
 * 
 * If you import package.classname then only declared class of this 
 * package will be accessible.
 */
import com.corejava.practice.javapractices.basicsofjava.oopsprinciples.
encapsulation.javapackage2.SimpleExampleOfJavaPack2;

import com.corejava.practice.javapractices.basicsofjava.oopsprinciples.
encapsulation.javapackage2.SimpleExampleOfJavaPackage2;

/**
 * @author abhishek-sriv
 * 
 * Example of package by import package.classname
 */
public class SimpleExample2ForPackageClassFromAnotherPackage 
extends SimpleExampleOfJavaPackage2 implements SimpleExampleOfJavaPack2{

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void invoke() {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleExampleOfJavaPackage2 simpleExampleOfJavaPackage2 = 
				new SimpleExampleOfJavaPackage2();
		simpleExampleOfJavaPackage2.msg();
	}
}
