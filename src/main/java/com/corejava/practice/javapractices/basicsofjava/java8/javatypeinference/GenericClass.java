package com.corejava.practice.javapractices.basicsofjava.java8.javatypeinference;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 * @param <X>
 */
@Component("genericclass")
class GenericClass<X> { 

	X name; 

	public void setName(X name){  
		this.name = name;  
	} 

	public X getName(){  
		return name;  
	} 

	public String genericMethod(GenericClass<String> x){  
		x.setName("Abhishek Kumar Srivastava");  
		return x.name;  
	} 

}