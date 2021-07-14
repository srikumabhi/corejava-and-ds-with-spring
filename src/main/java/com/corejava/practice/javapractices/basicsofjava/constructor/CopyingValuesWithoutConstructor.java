package com.corejava.practice.javapractices.basicsofjava.constructor;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class CopyingValuesWithoutConstructor {

	int developerId;  
	String developerName;

	/**
	 * 
	 * @param developerId
	 * @param developerName
	 */
	CopyingValuesWithoutConstructor(int developerId, String developerName){  
		this.developerId = developerId;  
		this.developerName = developerName;  
	}  

	/**
	 * 
	 */
	CopyingValuesWithoutConstructor(){
	}

	/**
	 * 
	 */
	void display(){
		System.out.println(developerId+" "+developerName);
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){ 
		
		CopyingValuesWithoutConstructor copyingValuesWithoutConstructor1 = 
				new CopyingValuesWithoutConstructor(101,"Abhishek Kumar Srivastava");  
		CopyingValuesWithoutConstructor copyingValuesWithoutConstructor2 = 
				new CopyingValuesWithoutConstructor();
		/*
		 * 
		 */
		copyingValuesWithoutConstructor2.developerId = 
				copyingValuesWithoutConstructor1.developerId;  
		copyingValuesWithoutConstructor2.developerName = 
				copyingValuesWithoutConstructor1.developerName; 
		
		/*
		 * 
		 */
		copyingValuesWithoutConstructor1.display();  
		copyingValuesWithoutConstructor2.display();  
	}  

}
