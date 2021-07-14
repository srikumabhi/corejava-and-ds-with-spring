package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.finalkeyword;

/**
 * @author abhishek-sriv
 */
public class ExampleOfBlankFinalVariable {
	/*
	 * What is blank or uninitialized final variable?
	 * A final variable that is not initialized at the time of declaration is 
          known as blank final variable.
	 * If you want to create a variable that is initialized at the time of 
          creating object and once initialized may not be changed, it is useful. 
          For example PAN CARD number of an employee.
	 * It can be initialized only in constructor.
	 */

	public int developerId;
	public final String DEVELOPER_NAME;
	public String developerCompanyName;
	public final String PAN_CARD_NUMBER;  

	/* It can be initialized only in constructor. */
	public ExampleOfBlankFinalVariable(){
		this.PAN_CARD_NUMBER = "ABCDEFGH";
		this.DEVELOPER_NAME = "Abhishek Kumar Srivastava";
	}

	/* It can not initialized only in class-method. */
	public void initializeBlankFinalVariable() {
		// this.PAN_CARD_NUMBER = "ABCDEFGH";
		// this.DEVELOPER_NAME = "Abhishek Kumar Srivastava";
	}
}
