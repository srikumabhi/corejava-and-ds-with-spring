package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation.accessmodifiers.defaultaccessmodifier;

/**
 * @author abhishek-sriv
 * 
 * Example of default access modifier:-
 * 
 * If you don't use any modifier, it is treated as default by default. 
   The default modifier is accessible only within package. It cannot be 
   accessed from outside the package. It provides more accessibility than 
   private. But, it is more restrictive than protected, and public.

 * In this example, we have created two packages accessmodifiers and defaultaccessmodifier. 
   We are accessing the DefaultClassFromOutsideItsPackage class from outside its 
   package, since DefaultClassFromOutsideItsPackage class is not public, so it 
   cannot be accessed from outside the package.
 */
/*
 * DefaultClassFromOutsideItsPackage cannot be resolved to a type
 */
//public class DefaultAccessModifierImpl extends DefaultClassFromOutsideItsPackage{
public class DefaultAccessModifierImpl{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *  The scope of class DefaultClassFromOutsideItsPackage and its method 
		 *  accessModifierPrint() are default so it cannot be accessed from 
		 *  outside the package.
		 */
		/* 
		 * Compile Time Error  
		 * 
		 * DefaultClassFromOutsideItsPackage cannot be resolved to a type
		 */
		//DefaultClassFromOutsideItsPackage classFromOutsideItsPackage = 
		//		new DefaultClassFromOutsideItsPackage();
		//classFromOutsideItsPackage.accessModifierPrint();
	}
}
