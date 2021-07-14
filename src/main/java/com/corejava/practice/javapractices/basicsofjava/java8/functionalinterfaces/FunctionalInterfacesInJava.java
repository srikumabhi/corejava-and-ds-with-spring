package com.corejava.practice.javapractices.basicsofjava.java8.functionalinterfaces;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class FunctionalInterfacesInJava {
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 */
	public interface Runnable{
		void run();
	}
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 * @param <V>
	 */
	public interface Callable<V>{
		V call() throws Exception;
	}
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 * @param <T>
	 */
	public interface Comparator<T>{
		int compare(T o1, T o2);
	}
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 * @param <T>
	 */
	public interface Comparable<T>{
		int compareTo(T t);
	}
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 * @param <T>
	 */
	public interface Predicate<T>{
		boolean test(T t);
	}
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 * @param <T>
	 */
	public interface Consumer<T>{
		Void accept(T t);
	}
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 * @param <T>
	 */
	public interface Supplier<T>{
		T get();
	}
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 * @param <T>
	 * @param <R>
	 */
	public interface Function<T, R>{
		R apply(T t);
	}
}
