package com.corejava.practice.javapractices.basicsofjava.statickeyword;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class CallingOfStaticAndNonStatic {

	public int developerId;

	//static blank final variable.  
	public static final String DEVELOPER_NAME = "Abhishek"; //initialized static blank final variable. 
	public static final String PAN_CARD_NUMBER="ABCDEFGH"; //initialized static blank final variable.  

	//static blank variable 
	public static String developerCompanyName="IBM";

	public static void testStaticMeth() {
		System.out.println("Static Test Method");
		/**
		 * The static method can not use non static data member or 
		 * call non-static method directly.
		 */
		/*
		 * Cannot make a static reference to the non-static 
		 * field developerId
		 */
		// developerId=101; // Compile Time Error.

		/*
		 * Cannot make a static reference to the non-static method 
		 * nonStaticMethod() from the type CallingOfStaticAndNonStatic
		 */
		// nonStaticMethod(); // Compile Time Error.
	}

	public void nonStaticMethod() {
		System.out.println("Non-Static Test Method");
		
		testStaticMeth();
		developerCompanyName="TCS";
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		testStaticMeth();
		developerCompanyName="HCL";

		CallingOfStaticAndNonStatic callingOfStaticAndNonStatic = 
				new CallingOfStaticAndNonStatic();
		System.out.println(callingOfStaticAndNonStatic.DEVELOPER_NAME);
		callingOfStaticAndNonStatic.testStaticMeth();
	}
}
