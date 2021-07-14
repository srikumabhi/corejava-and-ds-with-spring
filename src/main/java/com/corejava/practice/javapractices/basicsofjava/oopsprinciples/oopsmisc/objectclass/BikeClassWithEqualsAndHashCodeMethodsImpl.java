package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.oopsmisc.objectclass;

import java.util.Objects;

/**
 * The hashcode of a Java Object is simply a number, it is 32-bit signed int, 
 * that allows an object to be managed by a hash-based data structure. We know 
 * that hash code is an unique id number allocated to an object by JVM. But 
 * actually speaking, Hash code is not an unique number for an object. If 
 * two objects are equals then these two objects should return same hash code. 
 * So we have to implement hashcode() method of a class in such way that if two 
 * objects are equals, ie compared by equal() method of that class, then those 
 * two objects must return same hash code. If you are overriding hashCode you 
 * need to override equals method also.
 * 
 * Objects that are equal must have the same hash code within a running process
 * 
 * Please note that this does not imply the following common misconceptions:-
 *  # Unequal objects must have different hash codes – WRONG!
 *  # Objects with the same hash code must be equal – WRONG!
 *  
 * The 3 things you should know about hashCode():-
 *  # Whenever you implement equals, you must also implement hashCode
 *  # Never misuse hashCode as a key
 *  # Do not use hashCode in distributed applications
 * 
 * hashCode() is used for bucketing in Hash implementations like HashMap, 
 * HashTable, HashSet, etc.
 * The value received from hashCode() is used as the bucket number for storing 
 * elements of the set/map. This bucket number is the address of the element inside 
 * the set/map.
 * When you do contains() it will take the hash code of the element, then look for 
 * the bucket where hash code points to. If more than 1 element is found in the 
 * same bucket (multiple objects can have the same hash code), then it uses the 
 * equals() method to evaluate if the objects are equal, and then decide if 
 * contains() is true or false, or decide if element could be added in the set or 
 * not.
 * 
 * The default implementation provided by the JDK is based on memory 
 * location — two objects are equal if and only if they are stored in the same 
 * memory address. hashcode(): a method provided by java. lang. ... By default, 
 * this method returns a random integer that is unique for each instance.
 * 
 * @author abhishek-sriv
 * 
 * @see https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--
 */
public class BikeClassWithEqualsAndHashCodeMethodsImpl {

	private int engineCapacity;
	private String color;

	public BikeClassWithEqualsAndHashCodeMethodsImpl(int engineCapacity, 
			String color) {
		this.engineCapacity = engineCapacity;
		this.color = color;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 */
	public String toString() {
		return "Bike [engineCapacity=" + engineCapacity + ", color=" + color
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, engineCapacity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof BikeClassWithEqualsAndHashCodeMethodsImpl)) {
			return false;
		}
		BikeClassWithEqualsAndHashCodeMethodsImpl other = (BikeClassWithEqualsAndHashCodeMethodsImpl) obj;
		return Objects.equals(color, other.color) && engineCapacity == other.engineCapacity;
	}

	/**
	 * 
	 */
	/* public int hashCode() { 
		final int prime = 31; int result = 1; result = prime
				result + ((color == null) ? 0 : color.hashCode()); result = prime * result +
				engineCapacity; 
				return result; 
	} */

	/**
	 * 
	 */
	/* public int hashCode() { 
		return 100; 
	} */

	/**
	 * 
	 */
	/* public boolean equals(Object obj) { 
		if (this == obj) return true; if (obj ==null) 
			return false; 
		if (getClass() != obj.getClass()) 
			return false;
		BikeClassWithEqualsAndHashCodeMethodsImpl other =
				(BikeClassWithEqualsAndHashCodeMethodsImpl) obj; 
		if (color == null) { 
			if(other.color != null) return false; 
		} else if (!color.equals(other.color))
			return false; 
		if (engineCapacity != other.engineCapacity) 
			return false;
		return true; 
	} */

}
