package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.runtimepolymorphism;

import org.springframework.stereotype.Component;

/**
 * @author abhishek-sriv
 *
 * Java Program to demonstrate the real scenario of Java Method Overriding  
 * where three classes are overriding the method of a parent class.  
 */
@Component("")
public class MethodOverridingExample1 {

	//Creating a parent class.  
	class Bank {  
		int getRateOfInterest() {
			return 0;
		}  
	}

	/**
	 * Creating child classes. 
	 * 
	 * If you are overriding any method, 
	 * overridden method (i.e. declared in subclass) must not be more restrictive.
	 * Means you can increase the method accessibility or make it as same.
	 */
	class SBI extends Bank { 
		protected int getRateOfInterest() {
			return 8;
		}  
	}  
	class ICICI extends Bank {  
		public int getRateOfInterest() {
			return 7;
		}  
	} 
	class AXIS extends Bank {  
		public int getRateOfInterest() {
			return 9;
		}  
	} 

	/**
	 * 
	 */
	public void MethodOverridingExample1Impl() {

		SBI sbi = new SBI();  
		ICICI icici = new ICICI();  
		AXIS axis = new AXIS(); 

		System.out.println("SBI Rate of Interest: "+sbi.getRateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+icici.getRateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+axis.getRateOfInterest());
	}
}
