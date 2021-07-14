package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.oopsmisc.objectclass;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestOfObjectEquality {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 
		 */
		BikeClassWithEqualsMethodImpl bikeClassWithEqualsMethodImpl1 = new 
				BikeClassWithEqualsMethodImpl(150,"Black");
		BikeClassWithEqualsMethodImpl bikeClassWithEqualsMethodImpl2 = new 
				BikeClassWithEqualsMethodImpl(150,"Black");
		System.out.println(bikeClassWithEqualsMethodImpl1.equals(
				bikeClassWithEqualsMethodImpl2));
	}

}
