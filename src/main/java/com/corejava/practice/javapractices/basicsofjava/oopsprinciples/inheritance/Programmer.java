package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.inheritance;

/**
 * @author abhishek-sriv
 *
 * Programmer is the subclass and Employee is the superclass. 
 * The relationship between the two classes is Programmer IS-A Employee. 
 * It means that Programmer is a type of Employee.
 * 
 * In the below example, Programmer object can access the field of own class as 
 * well as of Employee class i.e. code reusability.
 */
public class Programmer extends Employee {

	int bonus=10000;  

	public static void main(String args[]){ 

		Programmer programmer = new Programmer(); 

		System.out.println("Programmer salary is:"+programmer.salary);  
		System.out.println("Bonus of Programmer is:"+programmer.bonus);
	}  
}
