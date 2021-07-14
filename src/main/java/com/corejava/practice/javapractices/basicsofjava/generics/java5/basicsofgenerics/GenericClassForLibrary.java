package com.corejava.practice.javapractices.basicsofjava.generics.java5.basicsofgenerics;

import java.util.List;

/**
 * 
 * @author Administrator
 *
 * @param <T>
 * 
 * "T" is the Type parameter. We can create Library of any Type
 */
public class GenericClassForLibrary<T> {

	/**
	 * Represents the list of items of type we will pass
	 */
	private List<T> items ; 

	/**
	 * 
	 * @param items
	 */
	public GenericClassForLibrary(List<T> items){
		this.items = items;
	}

	/**
	 * 
	 * @return
	 */
	public Object issueItem(){
		// write code to issue item. 
		return items.get(0);
	}

	/**
	 * 
	 * @param item
	 * 
	 * Again pass the same "T" type to issueItem method
	 */
	public void returnItem(T item){ 
		items.add(item);
	}

}
