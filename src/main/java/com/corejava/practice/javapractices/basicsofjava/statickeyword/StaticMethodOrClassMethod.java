package com.corejava.practice.javapractices.basicsofjava.statickeyword;

//import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 *
 */
//@Component("staticmethodorclassmethod")
public class StaticMethodOrClassMethod {

	/**
	 * Example using info like student. 
	 */
	//instance variable 
	int rollno; 
	String name;

	//static variable
	static String college ="ITS"; 

	/* Static block */
	static{
		System.out.println("static block in StaticMethodOrClassMethod class");
	}

	//constructor  
	/*
	 * StaticMethodOrClassMethod(){
	 * }
	 */

	StaticMethodOrClassMethod(int r, String n) {  
		rollno = r;  
		name = n;  
	}  

	//static method to change the value of static variable  
	static void change() {  
		college = "BBDIT";  
	}

	//method to display the values  
	static void displayUseForStatic() {
		System.out.println("College=>"+college);
	} 

	//method to display the values  
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}  

}
