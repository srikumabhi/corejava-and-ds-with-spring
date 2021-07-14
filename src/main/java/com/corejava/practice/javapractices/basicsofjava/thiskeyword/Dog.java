package com.corejava.practice.javapractices.basicsofjava.thiskeyword;

/**
 * @author abhishek-sriv
 * 
 */
/*
 * Whenever a method is declared as static then we should keep in mind these 
   points:-

 * A static method belongs to the class rather than object of a class.
 * A static method can be invoked without the need for creating an instance 
   of a class.
 * static method can access static data member and can change the value 
   of it.

 * Now, this keyword in java is a reference variable that refers to the 
   current object. Also the super keyword in java is a reference variable 
   which is used to refer immediate parent class object.

 * So, we can say that this and super both keyword are reference variable 
   that refers to some object. In other words these both keywords belong to
   instance of the class.

 * Whereas, static method belongs to the class than instance of the class. 
   And so static method can’t access this and super keyword in java.
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
