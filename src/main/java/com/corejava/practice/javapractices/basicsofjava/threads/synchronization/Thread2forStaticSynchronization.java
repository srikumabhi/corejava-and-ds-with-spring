package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Thread2forStaticSynchronization extends Thread{
	public void run(){  
		ExampleOfJavaSynchronized.staticSynchronization(5);  
	}
}
