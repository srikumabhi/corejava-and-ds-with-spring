package com.corejava.practice.javapractices.basicsofjava.statickeyword;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ExampleOfStaticVariable {

	int javaDeveloperId;//instance variable  
	String javaDeveloperName;  
	static String developersCompany ="HCL"; //static variable  

	//constructor  
	ExampleOfStaticVariable(int javaDeveloperId, String javaDeveloperName){  
		this.javaDeveloperId = javaDeveloperId;  
		this.javaDeveloperName = javaDeveloperName;  
	}  

	//method to display the information about developer...  
	void display (){
		System.out.println(javaDeveloperId+" "+javaDeveloperName+" "+developersCompany);
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){ 

		ExampleOfStaticVariable exampleOfStaticVariable1 = new ExampleOfStaticVariable(
				101, "Abhishek Kumar Srivastava");  
		ExampleOfStaticVariable exampleOfStaticVariable2 = new ExampleOfStaticVariable(
				102, "Rinshu");  

		//we can change the new company of all objects by the single line of code  
		ExampleOfStaticVariable.developersCompany="Google"; 

		exampleOfStaticVariable1.display();  
		exampleOfStaticVariable2.display();  

	}  

}
