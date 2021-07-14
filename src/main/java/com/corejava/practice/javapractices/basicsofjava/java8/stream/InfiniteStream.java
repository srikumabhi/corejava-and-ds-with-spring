package com.corejava.practice.javapractices.basicsofjava.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class InfiniteStream {
	/**
	 * 
	 */
	public void InfiniteIntStreamExampleWithIterate() {
		List<Integer> ints = IntStream.iterate(0, i -> i + 2)
				.mapToObj(Integer::valueOf)
				.limit(10)
				.collect(Collectors.toList());
		System.out.println(ints);
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new InfiniteStream().InfiniteIntStreamExampleWithIterate();
	}
}
