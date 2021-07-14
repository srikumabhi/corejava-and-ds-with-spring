package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.inheritance;

/**
 * 
 * @author abhishek-sriv
 *
 */
//compile time error.
//public class MultipleInheritanceIsNotSupportedInJava extends Test1,Test2 {
public class MultipleInheritanceIsNotSupportedInJava extends Test1 {
	public static void main(String args[]){

		MultipleInheritanceIsNotSupportedInJava multipleInheritanceIsNotSupportedInJava 
		= new MultipleInheritanceIsNotSupportedInJava();

		//Now which show() method would be invoked?  
		multipleInheritanceIsNotSupportedInJava.show(); 
	}  
}
