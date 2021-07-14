package com.corejava.practice.javapractices.basicsofjava.collectionframework.collections;

/**
 * A person in our system.
 */
public class Person
{
	/**
	 * Creates a new person.
	 * @param name The name of the person.
	 * @param age The age of the person.
	 */
	public Person(String name, int age)
	{
		this.age = age;
		this.name = name;
	}

	/**
	 * The name of the person.
	 */
	public String name;

	/**
	 * The age of the person.
	 */
	public int age;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
