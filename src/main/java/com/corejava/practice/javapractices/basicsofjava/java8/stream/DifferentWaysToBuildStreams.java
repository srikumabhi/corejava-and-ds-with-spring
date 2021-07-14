package com.corejava.practice.javapractices.basicsofjava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author abhishek-sriv
 *
 * @param <T>
 */
public class DifferentWaysToBuildStreams<T> implements Callable<T []> {

	public T arr[];

	public DifferentWaysToBuildStreams() {
	}
	public DifferentWaysToBuildStreams(T[] arr) {
		this.arr = arr;
	}
	
	@Override
	public T[] call() throws Exception {
		/**
		 * Stream forEach() and forEachOrdered()
		 * Stream.of()
		 * Stream.of(array)
		 */
		//Stream<T> stream = Stream.of(arr);
		//Consumer<? super T> action = e-> System.out.println(e);
		//stream.forEachOrdered(action);
		//stream.forEach(action);
		/**
		 * Java Boxed Stream
		 */
		List<? super T> strings = Stream.of(arr)
				.collect(Collectors.toList());

		return arr;
	}
	/**
	 * 
	 * @param <T>
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.
				newFixedThreadPool(10);
		/*
		 * ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.
		 * newWorkStealingPool(4);
		 */
		List<Future<T []>> resultList = new ArrayList<>();

		Integer[] arrInteger = new Integer[] {0, 2, 1, 2, 0};
		String [] arrString = new String[] {"AMAN", "AMITABH", "LOKESH", "RAHUL", "SHEKHAR"};
		DifferentWaysToBuildStreams<T> differentWaysToBuildStreams = new 
				DifferentWaysToBuildStreams<T>((T[]) arrString);

		Future<T[]> result = threadPoolExecutor.submit(differentWaysToBuildStreams);
		resultList.add(result);

		for(Future<T[]> future : resultList){
			try {
				System.out.println("Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
				for(T element : future.get()) {
					//System.out.println(element);
				}
			}
			catch (InterruptedException | ExecutionException e){
				e.printStackTrace();
			}
		}
		/* shut down the executor service now */
		threadPoolExecutor.shutdown();
	}

}
