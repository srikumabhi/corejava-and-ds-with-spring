package com.corejava.practice.javapractices.basicsofjava.java8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

/**]
 * 
 * @author abhishek-sriv
 *
 */
public class StreamApiPractise {
	/**
	 * 
	 */
	public void test() {
		List<String> arrayList= new ArrayList<>();
		arrayList.parallelStream().close();

		List<String> linkedList= new LinkedList<>();
		linkedList.parallelStream().close();

		Set<String> hashSet = new HashSet<>();
		hashSet.parallelStream().close();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.parallelStream().close();
		Set<String> treeSet = new TreeSet<>();
		treeSet.parallelStream().close();

		Queue<String> queue = new PriorityQueue<>();
		queue.parallelStream().close();

		Stack<String> stack = new Stack<>();
		stack.parallelStream().close();

		Map<String, String> hashMap = new HashMap<>();
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		Map<String, String> treeMap = new TreeMap<>();
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	}
}
