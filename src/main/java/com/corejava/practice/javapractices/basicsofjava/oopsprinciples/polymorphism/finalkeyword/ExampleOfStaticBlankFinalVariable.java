package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.
polymorphism.finalkeyword;

/**
 * @author abhishek-sriv
 */
public class ExampleOfStaticBlankFinalVariable {

	//static blank final variable 
	public static final String DEVELOPER_NAME;
	public static final String PAN_CARD_NUMBER="ABCDEFGH"; //initialized static blank final variable.  
	public static final String TEST;

	//static blank variable 
	public static String developerCompanyName; 

	public ExampleOfStaticBlankFinalVariable(){
		ExampleOfStaticBlankFinalVariable.developerCompanyName="KahiNahi";
		// PAN_CARD_NUMBER = "ABCDEFGH"; // Compile Time Error.
		// DEVELOPER_NAME = "Abhishek Kumar Srivastava"; // Compile Time Error.
	}

	/*
	 * A static final variable that is not initialized at the time of declaration is 
	 * known as static blank final variable. 
	 * It can be initialized only in static block.
	 */
	static{
		DEVELOPER_NAME = "Abhishek Kumar Srivastava";
		ExampleOfStaticBlankFinalVariable.developerCompanyName="KahiNahi";
		developerCompanyName="KahiNahi"; // This also working fine

		/*
		 * In case of static blank final variable
		 *  
		 * The final field ExampleOfStaticBlankFinalVariable.TEST 
		 * cannot be assigned. 
		 */
		//ExampleOfStaticBlankFinalVariable.TEST="ExampleOfEncapsulationInJava"; // Compile Time Error.
		TEST="ExampleOfEncapsulationInJava"; // It's work fine =? 
	}  
}
