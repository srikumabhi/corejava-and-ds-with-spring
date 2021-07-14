package com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics;

/**
 * 
 * @author Administrator
 *
 * @param <T>
 */
public class GenericClass<T>{  

	public T object; 

	/**
	 * 
	 * @param object
	 */
	public void addObject(T object) {
		this.object=object;
	}  

	/**
	 * 
	 * @return 
	 */
	public T getObject() {
		return object;
	}  

}

