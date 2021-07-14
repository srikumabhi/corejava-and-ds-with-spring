package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Thread1forDeadlockExample2 extends Thread{

	Resource1 resource1; 

	Thread1forDeadlockExample2(Resource1 resource1){  
		this.resource1 = resource1;  
	} 

	public void run(){  
		resource1.synchronizedMethod1();
	} 
}
