package com.corejava.practice.javapractices.basicsofjava.java8.stream;

import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author Administrator
 *
 */
public class StreamApi {

	@SuppressWarnings("unused")
	private static int sumIterator(List<Integer> list) {
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

	@SuppressWarnings("unused")
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).
				mapToInt(i -> i).sum();
	}
}
