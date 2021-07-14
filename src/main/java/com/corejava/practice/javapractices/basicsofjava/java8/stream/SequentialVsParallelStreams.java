package com.corejava.practice.javapractices.basicsofjava.java8.stream;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Parallel streams divide the provided task into many and run them in 
 * different threads, utilizing multiple cores of the computer. On the 
 * other hand sequential streams work just like for-loop using a single 
 * core.
 * The tasks provided to the streams are typically the iterative operations 
 * performed on the elements of a collection or array or from other dynamic 
 * sources. Parallel execution of streams run multiple iterations simultaneously 
 * in different available cores.
 * 
 * In parallel execution, if number of tasks are more than available cores at a 
 * given time, the remaining tasks are queued waiting for currently running task 
 * to finish.
   It is also important to know that iterations are only performed at a terminal 
   operation. The streams are designed to be lazy.
 * 
 * @author abhishek-sriv
 */
public class SequentialVsParallelStreams {

	/**
	 * 
	 * @param stream
	 */
	public static void run (Stream<String> stream) {

		stream.forEach(s -> {
			System.out.println(LocalTime.now() + " - value: " + s +
					" - thread: " + Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * 
	 * @param args
	 */
	public static void main (String[] args) {
		String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

		System.out.println("-------\nRunning sequential\n-------");
		run(Arrays.stream(strings).sequential());
		System.out.println("-------\nRunning parallel\n-------");
		run(Arrays.stream(strings).parallel());
	}
}
