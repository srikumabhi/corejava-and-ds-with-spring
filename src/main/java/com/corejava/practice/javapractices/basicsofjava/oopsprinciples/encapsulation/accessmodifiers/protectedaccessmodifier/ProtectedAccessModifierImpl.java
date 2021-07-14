package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.
encapsulation.accessmodifiers.protectedaccessmodifier;

import com.corejava.practice.javapractices.basicsofjava.oopsprinciples.
encapsulation.accessmodifiers.*;

/**
 * @author abhishek-sriv
 * 
 * Example of protected access modifier:-
 * 
 * The protected access modifier is accessible within package and 
   outside the package but through inheritance only.

 * The protected access modifier can be applied on the data member, 
   method and constructor. It can't be applied on the class.

 * It provides more accessibility than the default modifer.

 * In this example, we have created the two packages protectedaccessmodifier 
   and accessmodifiers. The PublicClassFromOutsideItsPackage class of
   accessmodifiers package is public, so can be accessed from outside the package. 
   But accessModifierShow method of this package is declared as protected, so 
   it can be accessed from outside the class only through inheritance.
 */
public class ProtectedAccessModifierImpl extends PublicClassFromOutsideItsPackage {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ProtectedAccessModifierImpl protectedAccessModifierImpl = 
				new ProtectedAccessModifierImpl();
		protectedAccessModifierImpl.accessModifierShow();
		//protectedAccessModifierImpl.accessModifierInvoke();

	}
}
