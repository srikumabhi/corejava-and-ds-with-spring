package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Thread2forDeadlockExample2 extends Thread{

	Resource2 resource2; 

	Thread2forDeadlockExample2(Resource2 resource2){  
		this.resource2 = resource2;  
	} 

	public void run(){  
		resource2.synchronizedMethod2();
	} 
}
