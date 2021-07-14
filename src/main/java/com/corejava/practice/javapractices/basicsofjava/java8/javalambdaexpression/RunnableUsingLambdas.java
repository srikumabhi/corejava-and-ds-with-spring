package com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component("runnableusinglambdas")
public class RunnableUsingLambdas {

	public void runnableUsingLambdasImpl() {

		/**
		 * 
		 */
		Thread thread = new Thread( new Runnable() {
			@Override
			public void run() {
				System.out.println("Printed inside Runnable.");
			}
		});
		thread.start();

		/**
		 * 
		 */
		Thread threadLambda = new Thread(() -> System.out.println(
				"Printed inside Lambda Runnable."));
		threadLambda.start();

	}

}
