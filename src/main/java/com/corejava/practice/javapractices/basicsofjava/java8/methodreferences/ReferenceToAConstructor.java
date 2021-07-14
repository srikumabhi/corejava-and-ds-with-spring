package com.corejava.practice.javapractices.basicsofjava.java8.methodreferences;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component
public class ReferenceToAConstructor {

	/**
	 * 
	 */
	ReferenceToAConstructor(){
	}

	/**
	 * 
	 * @param msg
	 */
	ReferenceToAConstructor(String msg){  
		System.out.print(msg);  
	}

	/**
	 * 
	 */
	public void  ReferenceToAConstructorImpl1() {  

		SaySomthing saySomthing = ReferenceToAConstructor::new;  
		saySomthing.saySomthingMsg("Implementation of ReferenceToAConstructor");  
	}

}