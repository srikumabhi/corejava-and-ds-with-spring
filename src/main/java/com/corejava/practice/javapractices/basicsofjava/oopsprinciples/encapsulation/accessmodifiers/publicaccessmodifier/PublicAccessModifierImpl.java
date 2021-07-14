package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation.accessmodifiers.publicaccessmodifier;

import com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation.accessmodifiers.PublicClassFromOutsideItsPackage;

/**
 * @author abhishek-sriv
 * 
 * The public access modifier is accessible everywhere. It has the widest scope
   among all other modifiers.
 *
 */
public class PublicAccessModifierImpl {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PublicClassFromOutsideItsPackage publicClassFromOutsideItsPackage = 
				new PublicClassFromOutsideItsPackage();
		publicClassFromOutsideItsPackage.accessModifierInvoke();
	}

}
