package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.oopsmisc.objectclass;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestOfObjectEqualityWithdefultEqualsMethod {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 */
		Bike bike1 = new Bike(150,"Black");
		Bike bike2 = new Bike(150,"Black");

		//System.out.println(bike1.hashCode());
		//System.out.println(bike2.hashCode());
		//System.out.println(bike1.equals(bike2));

		/**
		 * 
		 */
		Bike bike3 = new Bike(150,"Black");
		Bike bike4 = bike3;
		Bike bike5 = bike4;

		System.out.println(bike3.hashCode());
		System.out.println(bike4.hashCode());
		System.out.println(bike5.hashCode());

		System.out.println(bike3.equals(bike4));
		System.out.println(bike5.equals(bike3));
		System.out.println(bike4.equals(bike5));
	}
}
