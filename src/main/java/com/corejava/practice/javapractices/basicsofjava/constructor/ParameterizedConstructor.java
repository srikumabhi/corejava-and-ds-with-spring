package com.corejava.practice.javapractices.basicsofjava.constructor;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ParameterizedConstructor {

	int developerId;  
	String developerName;

	//creating a parameterized constructor  
	ParameterizedConstructor(int developerId, String developerName) {  
		this.developerId = developerId;  
		this.developerName = developerName;  
	}  

	//method to display the values  
	void display() {
		System.out.println(developerId+" "+developerName);
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {  

		//creating objects and passing values  
		ParameterizedConstructor parameterizedConstructor1 = 
				new ParameterizedConstructor(101,"Abhishek Kumar Srivastava");  
		ParameterizedConstructor parameterizedConstructor2 = 
				new ParameterizedConstructor(102,"Rinshu");

		//calling method to display the values of object  
		parameterizedConstructor1.display();  
		parameterizedConstructor2.display();  

	}  

}
