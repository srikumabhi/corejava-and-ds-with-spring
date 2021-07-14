package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Thread1forStaticSynchronization extends Thread{
	public void run(){  
		ExampleOfJavaSynchronized.staticSynchronization(11);  
	}
}
