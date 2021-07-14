package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.oopsmisc.objectclass;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TestSignificanceOfEqualsAndHashCode {
	public static void main(String[] args) {

		Set<String> strings = new HashSet<String>();
		String name = new String("Abhishek");
		String anotherName = new String("Abhishek");
		strings.add(name);
		strings.add(anotherName);
		System.out.println(name.equals(anotherName));
		System.out.println("size of set = " + strings.size());
		System.out.println(strings);

		BikeClassWithEqualsAndHashCodeMethodsImpl bike1 = new 
				BikeClassWithEqualsAndHashCodeMethodsImpl(150, "red");
		BikeClassWithEqualsAndHashCodeMethodsImpl bike2 = new
				BikeClassWithEqualsAndHashCodeMethodsImpl(150, "red");
		System.out.println(bike1.equals(bike2));
		Set<BikeClassWithEqualsAndHashCodeMethodsImpl> bikes = new 
				HashSet<BikeClassWithEqualsAndHashCodeMethodsImpl>();
		bikes.add(bike2);
		bikes.add(bike1);
		System.out.println("size of set = " +  bikes.size());
		System.out.println(bikes);

	}
}
