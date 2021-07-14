package com.corejava.practice.javapractices.basicsofjava.java8.predicate;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component
public class Employee {

	private Integer id;
	private Integer age;
	private String gender;
	private String firstName;
	private String lastName;

	/**
	 * 
	 * @param id
	 * @param age
	 * @param gender
	 * @param fName
	 * @param lName
	 */
	public Employee(Integer id, Integer age, String gender, String fName, String lName){
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.firstName = fName;
		this.lastName = lName;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return this.id.toString()+" - "+this.age.toString();
	}

}
