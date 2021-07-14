package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.superkeyword;

public class ChildClass extends ParentClass{

	ChildClass(){
		System.out.println("Child Class Default-Constructor.");
	}

	ChildClass(String stringText){
		System.out.println("Child Class  parameterized-Constructor with "
				+ "stringText.");
	}

	ChildClass(int intTest){
		System.out.println("Child Class  parameterized-Constructor with "
				+ "intTest.");
	}

	public static void main(String[] args) {
		new ChildClass();
		new ChildClass("Abhishek");
		new ChildClass(101);
	}
}
