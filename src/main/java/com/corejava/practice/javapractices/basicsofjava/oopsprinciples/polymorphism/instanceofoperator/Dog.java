package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.instanceofoperator;

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

	/*
	 * Possibility of downcasting with instanceof
	 */
	public static void possibilityOfDowncastingWithInstanceof(Animal animal) {  
		if(animal instanceof Dog){  
			Dog dog = (Dog)animal; //downcasting  
			System.out.println("ok downcasting performed with instanceof");  
		}  
	}

	/*
	 * Downcasting without the use of java instanceof
	 * Downcasting can also be performed without the use of instanceof operator.
	 */
	public static void downcastingWithoutTheUseOfJavaInstanceof(Animal animal) {  
		Dog dog = (Dog)animal; //downcasting  
		System.out.println("ok downcasting performed without instanceof");  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		System.out.println(dog1 instanceof Dog);

		Animal animal2 = new Dog(); // Upcasting  
		System.out.println(animal2 instanceof Animal);
		System.out.println(animal2 instanceof Dog);

		/*
		 * If we apply instanceof operator with a variable that have null value, 
		 * it returns false.
		 */
		Dog dog2 = null;
		System.out.println(dog2 instanceof Dog);

		/****************** DownCasting ***********************/
		// Compilation error 
		// Dog dog3 = new Animal();

		/*
		 * Compiles successfully, but ClassCastException is thrown at runtime
		 */
		try {
			Dog dog4 = (Dog) new Animal(); 
		} catch (Exception e) {
			//System.out.println("** ClassCastException **");
			e.printStackTrace();
		}

		/**
		 * Downcasting with java instanceof operator:-
		 * 
		 * When Subclass type refers to the object of Parent class, it is known as 
		 * downcasting. If we perform it directly, compiler gives Compilation error. 
		 * If you perform it by typecasting, ClassCastException is thrown at runtime. 
		 * But if we use instanceof operator, downcasting is possible.
		 */

		/*
		 * Possibility of downcasting with instanceof
		 */
		Animal animal4 = new Dog(); //Upcasting
		Dog.possibilityOfDowncastingWithInstanceof(animal4); 

		/*
		 * Downcasting without the use of java instanceof
		 */
		Animal animal5 = new Dog(); //Upcasting
		Dog.downcastingWithoutTheUseOfJavaInstanceof(animal5);  
	}
}
