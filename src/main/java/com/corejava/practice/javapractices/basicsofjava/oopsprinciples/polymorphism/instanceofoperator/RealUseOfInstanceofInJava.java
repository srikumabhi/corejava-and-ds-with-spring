package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.instanceofoperator;

/**
 * @author abhishek-sriv
 * 
 * Real use of instanceof in java
 */
public class RealUseOfInstanceofInJava {
	/**
	 * @param printable
	 */
	void invoke(Printable printable){ //upcasting  
		if(printable instanceof PrintableImpl1){  
			//Downcasting   
			PrintableImpl1 printableImpl1 = (PrintableImpl1)printable; 
			printableImpl1.PrintableImpl1Method();  
		}  
		if(printable instanceof PrintableImpl2){  
			//Downcasting   
			PrintableImpl2 printableImpl2 = (PrintableImpl2)printable; 
			printableImpl2.PrintableImpl2Method();  
		}  
	} 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RealUseOfInstanceofInJava realUseOfInstanceofInJava =
				new RealUseOfInstanceofInJava(); 

		Printable printable1 = new PrintableImpl1();  	 
		realUseOfInstanceofInJava.invoke(printable1);
		
		Printable printable2 = new PrintableImpl2();  	 
		realUseOfInstanceofInJava.invoke(printable2); 
	}
}
