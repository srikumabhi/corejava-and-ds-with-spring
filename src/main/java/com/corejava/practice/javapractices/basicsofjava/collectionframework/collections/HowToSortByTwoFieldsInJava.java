package com.corejava.practice.javapractices.basicsofjava.collectionframework.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class HowToSortByTwoFieldsInJava {

	private static void order(List<Person> persons) {

		Collections.sort(persons, new Comparator() {

			public int compare(Object o1, Object o2) {

				String s1 = ((Person) o1).getName();
				String s2 = ((Person) o2).getName();
				int nameComp = s1.compareTo(s2);

				if (nameComp != 0) {
					return nameComp;
				} 

				Integer x1 = ((Person) o1).getAge();
				Integer x2 = ((Person) o2).getAge();
				return x1.compareTo(x2);

			}});
	}

}
