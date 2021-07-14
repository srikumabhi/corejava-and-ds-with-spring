package com.corejava.practice.javapractices.basicsofjava.java8.stream;

import java.util.Iterator;
import java.util.List;

/**
 * Java 8 Stream API was introduced. We can use Java Stream API to 
 * implement internal iteration, that is better because java framework 
 * is in control of the iteration.
   Internal iteration provides several features such as sequential 
   and parallel execution, filtering based on the given criteria, mapping 
   etc.
   Most of the Java 8 Stream API method arguments are functional 
   interfaces, so lambda expressions work very well with them. Let’s 
   see how can we write above logic in a single line statement using 
   Java Streams.
   There are two types of iterators: external and internal. An external 
   iterator is active, an internal is passive.
   When the client (i.e. the programmer) controls the iteration, the iterator 
   is called external iterator. When the iterator controls it, it is called 
   an internal iterator.
   Generally, it is recommended to use internal iterator over external
   iterator. Internal iteration is less error prone, more readable, 
   and requires less code. On the other hand, external iterator is 
   sometimes more flexible; for instance, when doing an operation 
   for two collections in a loop.

 * @author abhishek-sriv
 *
 */
public class WhyJavaStreamAPIIsRequired {

	/**
	 * 
	 * @param list
	 * @return
	 */
	public int externalIteration(List<Integer> list){

		Iterator<Integer> it = list.iterator();
		int sum = 0;

		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}

		return sum;
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	public int internalIteration(List<Integer> list) {
		return list
				.stream()
				.filter(i -> i > 10)
				.mapToInt(i -> i)
				.sum();
	}
}
