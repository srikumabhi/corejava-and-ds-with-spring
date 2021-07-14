package com.corejava.practice.javapractices.basicsofjava.java8.stream;

import java.util.IntSummaryStatistics;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class StreamApiPrac {
	/**
	 * 
	 */
	public void practices() {
		int[] numbers = {4, 1, 13, 90, 16, 2, 0};
		/* */
		int minNumber = IntStream.of(numbers).min().getAsInt();
		System.out.println(minNumber);
		/* */
		int maxNumber = IntStream.of(numbers).max().getAsInt();
		System.out.println(maxNumber);
		/* */
		Double averageNumber = IntStream.of(numbers).average().getAsDouble();
		System.out.println(averageNumber);
		/* */
		long countNumber = IntStream.of(numbers).count();
		System.out.println(countNumber);
		/* */
		int sumNumber = IntStream.of(numbers).sum();
		System.out.println(sumNumber);
		/* */
		IntStream.of(numbers).skip(3).forEachOrdered((number)-> System.out.println(number));
		/* */
		IntStream.of(numbers).map(number-> number*2).forEachOrdered((number)-> System.out.println(number));
		/* */
		IntStream.of(numbers).boxed().forEachOrdered((number)-> System.out.println(number));
		/* */
		IntSummaryStatistics intSummaryStatistics = IntStream.of(numbers).summaryStatistics();
		System.out.println(intSummaryStatistics.getAverage()+", "+
				intSummaryStatistics.getCount()+", "+ intSummaryStatistics.getMax()+", "+
				intSummaryStatistics.getMin()+", "+ intSummaryStatistics.getSum());
		/* */
		IntStream.of(numbers). distinct().sorted().limit(3).
		forEach((number)->System.out.println(number));
		/* */
		IntStream.range(1, 100).forEach(number->System.out.println(number));
		/* */
		IntStream.rangeClosed(10, 90).boxed().collect(Collectors.toList()).
		forEach(number->System.out.println(number));
		/* */
		boolean flagAnyMatch = IntStream.of(numbers).anyMatch(number-> number % 2 == 1);
		System.out.println(flagAnyMatch);
		/* */
		boolean flagAllMatch = IntStream.of(numbers).allMatch(number-> number % 2 == 1);
		System.out.println(flagAllMatch);
	}
	public interface Runnable{
		void run();
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//new StreamApiPrac().practices();

		//Runnable runnable = () ->{new StreamApiPrac().practices();};

		Executors.newCachedThreadPool().execute(()-> new StreamApiPrac().practices());
		//Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()).execute(()->new StreamApiPrac().practices());
		//Executors.newSingleThreadExecutor().execute(()->new StreamApiPrac().practices());
		//Executors.newWorkStealingPool().execute(()->new StreamApiPrac().practices());
		//Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()).execute(()->new StreamApiPrac().practices());
		//Executors.newSingleThreadScheduledExecutor().execute(()->new StreamApiPrac().practices());
	}
}
