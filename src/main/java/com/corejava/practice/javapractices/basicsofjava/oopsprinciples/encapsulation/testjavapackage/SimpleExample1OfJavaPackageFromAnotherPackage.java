package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.
encapsulation.testjavapackage;

/*
 * import package.*;
 * 
 * If you use package.* then all the classes and interfaces of this package will be
 * accessible but not subpackages.
 * The import keyword is used to make the classes and interface of another package 
 * accessible to the current package.
 */
import com.corejava.practice.javapractices.basicsofjava.oopsprinciples.
encapsulation.javapackage1.*;

/**
 * @author abhishek-sriv
 * 
 * Example of package that import the packagename.*
 */
public class SimpleExample1OfJavaPackageFromAnotherPackage extends 
SimpleExampleOfJavaPackage1 implements SimpleExampleOfJavaPack1 {

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
	 */
	public void message() {
		msg();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleExampleOfJavaPackage1 simpleExampleOfJavaPackage1 = 
				new SimpleExampleOfJavaPackage1();
		simpleExampleOfJavaPackage1.msg();
	}
}
