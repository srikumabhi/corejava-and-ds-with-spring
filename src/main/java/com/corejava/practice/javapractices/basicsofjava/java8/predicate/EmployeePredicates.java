package com.corejava.practice.javapractices.basicsofjava.java8.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component
public interface EmployeePredicates {

	/**
	 * 
	 * @return
	 */
	public static Predicate<Employee> isAdultMale() {
		return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
	}

	/**
	 * 
	 * @return
	 */
	public static Predicate<Employee> isAdultFemale() {
		return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
	}

	/**
	 * 
	 * @param age
	 * @return
	 */
	public static Predicate<Employee> isAgeMoreThan(Integer age) {
		return p -> p.getAge() > age;
	}

	/**
	 * 
	 * @param employees
	 * @param predicate
	 * @return
	 */
	public static List<Employee> filterEmployees (List<Employee> employees,
			Predicate<Employee> predicate){

		System.out.println("predicate="+predicate.toString());

		return employees.stream()
				.filter( predicate )
				.collect(Collectors.<Employee>toList());
	}

}  