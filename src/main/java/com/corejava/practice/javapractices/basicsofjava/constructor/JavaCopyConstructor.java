package com.corejava.practice.javapractices.basicsofjava.constructor;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaCopyConstructor {

	int developerId;  
	String developerName; 

	//constructor to initialize integer and string  
	JavaCopyConstructor(int developerId, String developerName) {  
		this.developerId = developerId;  
		this.developerName = developerName;  
	}

	//constructor to initialize another object  
	JavaCopyConstructor(JavaCopyConstructor javaCopyConstructor) {  
		developerId = javaCopyConstructor.developerId;  
		developerName =javaCopyConstructor.developerName;  
	} 

	/**
	 * 
	 */
	void display() {
		System.out.println(developerId+" "+developerName);
	}  

	/**
	 * @param args
	 */
	public static void main(String args[]) { 

		JavaCopyConstructor javaCopyConstructor1 = 
				new JavaCopyConstructor(101,"Abhishek Kumar Srivastava");  
		JavaCopyConstructor javaCopyConstructor2 = 
				new JavaCopyConstructor(javaCopyConstructor1);

		javaCopyConstructor1.display();  
		javaCopyConstructor2.display();  
	}  

}
