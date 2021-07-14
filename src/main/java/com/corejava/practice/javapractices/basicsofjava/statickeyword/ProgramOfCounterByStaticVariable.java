package com.corejava.practice.javapractices.basicsofjava.statickeyword;

/**
 * @author abhishek-sriv
 * 
 * As we know, the static variable will get the memory only once, if any object 
 * changes the value of the static variable, it will retain its value.
 */
public class ProgramOfCounterByStaticVariable {
	
	static int count=0; //will get memory each time when the instance is created  

	/**
	 * 
	 */
	ProgramOfCounterByStaticVariable(){  
		count++; //incrementing value  
		System.out.println(count);  
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){ 

		//Creating objects  
		ProgramOfCounterByStaticVariable counter1 = 
				new ProgramOfCounterByStaticVariable();  
		ProgramOfCounterByStaticVariable counter2 = 
				new ProgramOfCounterByStaticVariable();  
		ProgramOfCounterByStaticVariable counter3 = 
				new ProgramOfCounterByStaticVariable();

	}

}
