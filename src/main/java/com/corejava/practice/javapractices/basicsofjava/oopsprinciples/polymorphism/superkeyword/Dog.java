package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.
polymorphism.superkeyword;

/**
 * @author abhishek-sriv
 * 
 */
public class Dog extends Animal {

	/* */
	Dog(){
		//super();
		System.out.println("Dog class(Child-Class) no-arg/default-constructor."
				+ "Dog is created...");
	}

	/* */
	Dog(String animalType){
		//super();
		System.out.println("Dog class(Child-Class) parameterized-construtor. "
				+ animalType+" is animal-type...");
	}

	/* */
	String colour="black"; 

	/* */
	void bark(){
		System.out.println("barking...");
	} 

	/* */
	void colorOfDog(){ 
		//prints color of Animal class 
		System.out.println(super.colour); 

		//prints color of Dog class 
		System.out.println("Dog-Colour:- "+this.colour); 
	} 

	/* */
	void activityOfDog(){
		/* mainActivity is a static-variable 
		 * The static field Animal.mainActivity should be accessed in a 
		 * static  way.
		 * super and this cannot be used in static context.
		 */
		super.mainActivity="EnjoyingWithSuperKeyword";
		System.out.println(super.mainActivity);

		this.mainActivity="EnjoyingWithThisKeyword";
		System.out.println(this.mainActivity); 

		/*
		 * Calling a static-method by super and this keyword
		 */
		super.showAnimal();
		this.showAnimal();

		/*
		 * NonStatic-method
		 */
		super.eat(); 

		/*
		 * 
		 */
		System.out.println(colour);

		/*
		 * Method of Dog class
		 */
		bark();  
	}

	/* */
	public static void testDog() {
		/*
		 * Calling a static-variable by super-keyword
		 * Cannot use super in a static context
		 * 
		 * super and this cannot be used in static context
		 * 
		 * Compile Time Error.
		 */
		//super.mainActivity="EnjoyingWithSuperKeyword";
		//System.out.println(super.mainActivity);
		//this.mainActivity="EnjoyingWithThisKeyword";
		//System.out.println(this.mainActivity); 

		/*
		 * Calling a static-method by super-keyword
		 * Cannot use super in a static context
		 * 
		 * super and this cannot be used in static context.
		 * 
		 * Compile Time Error.
		 */
		//super.showAnimal();
		//this.showAnimal();

		/*
		 * The static method can not use non static data member or call 
		 * non-static method directly.
		 * 
		 * Compile Time Error.
		 */
		//activityOfDog();
		//System.out.println(colour);

		Dog testDog = new Dog();
		testDog.activityOfDog();
		System.out.println(testDog.colour);
	}
}
