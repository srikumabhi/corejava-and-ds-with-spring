package com.corejava.practice.javapractices.basicsofjava.statickeyword;

/**
 * @author abhishek-sriv
 * 
 * In this example, we have created an instance variable named count which is incremented 
 * in the constructor. Since instance variable gets the memory at the time of object 
 * creation, each object will have the copy of the instance variable. If it is incremented, 
 * it won't reflect other objects. So each object will have the value 1 in the count variable.
 */
public class ProgramOfTheCounterWithoutStaticVariable {

	int count=0; //will get memory each time when the instance is created  

	/**
	 * 
	 */
	ProgramOfTheCounterWithoutStaticVariable(){  
		count++; //incrementing value  
		System.out.println(count);  
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){ 

		//Creating objects  
		ProgramOfTheCounterWithoutStaticVariable counter1 = 
				new ProgramOfTheCounterWithoutStaticVariable();  
		ProgramOfTheCounterWithoutStaticVariable counter2 = 
				new ProgramOfTheCounterWithoutStaticVariable();  
		ProgramOfTheCounterWithoutStaticVariable counter3 = 
				new ProgramOfTheCounterWithoutStaticVariable();
	}  

}
