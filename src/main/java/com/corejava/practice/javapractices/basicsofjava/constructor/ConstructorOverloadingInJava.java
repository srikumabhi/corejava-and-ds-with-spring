package com.corejava.practice.javapractices.basicsofjava.constructor;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ConstructorOverloadingInJava {

	int developerId;  
	String developerName;  
	int developerAge; 

	//creating two arg constructor  
	ConstructorOverloadingInJava(int developerId, String developerName) {  
		this.developerId = developerId;  
		this.developerName = developerName;  
	}  

	//creating three arg constructor  
	ConstructorOverloadingInJava(int developerId, String developerName, 
			int developerAge) {
		this.developerId = developerId;  
		this.developerName = developerName;  
		this.developerAge = developerAge;  
	} 

	/**
	 * 
	 */
	void display() {
		System.out.println(developerId+" "+developerName+" "+developerAge);
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) { 

		ConstructorOverloadingInJava constructorOverloadingInJava1 = 
				new ConstructorOverloadingInJava(101,"Abhishek Kumar Srivastava");  
		ConstructorOverloadingInJava constructorOverloadingInJava2 = 
				new ConstructorOverloadingInJava(102,"Rinshu", 29); 

		constructorOverloadingInJava1.display();  
		constructorOverloadingInJava2.display();
	}  

}
