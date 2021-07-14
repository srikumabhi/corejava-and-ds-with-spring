package com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Administrator
 *
 */
@Service("genericsexample")
public class GenericsExample {

	@Autowired	
	public MechanicForPolymorphismWithGenerics mechanicForPolymorphismWithGenerics;

	@Autowired	
	public TheWildcardOperator theWildcardOperator;

	/**
	 * 
	 */
	public void polymorphismWithGenericsImpl() {
		mechanicForPolymorphismWithGenerics.mechanicForPolymorphismWithGenericsImpl();
	}

	/**
	 * 
	 */
	public void theWildcardOperatorImpl() {
		theWildcardOperator.theWildcardOperatorExampelsImpl();

	}

}
