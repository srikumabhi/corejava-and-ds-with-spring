package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class CustomerClassExampleOfInterThreadCommunicationImpl {

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){ 

		final CustomerClassExampleOfInterThreadCommunication 
		customerClassExampleOfInterThreadCommunication = new 
		CustomerClassExampleOfInterThreadCommunication(); 

		new Thread(){  
			public void run(){
				customerClassExampleOfInterThreadCommunication.
				withdraw(15000);
			}  
		}.start();  
		new Thread(){  
			public void run(){
				customerClassExampleOfInterThreadCommunication.
				deposit(10000);
			}  
		}.start();  
	}
}
