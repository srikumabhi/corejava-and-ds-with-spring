package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class CustomerClassExampleOfInterThreadCommunication {

	int amount=10000;  

	/**
	 * 
	 * @param amount
	 */
	synchronized void withdraw(int amount){  
		System.out.println("Going to withdraw...");  

		if(this.amount<amount){  
			System.out.println("Less balance; waiting for deposit...");  
			try{
				/*
				 * Lock or monitor has been released.
				 */
				wait();
			}catch(Exception e){

			}  
		}  
		this.amount-=amount;  
		System.out.println("Current amount:-"+this.amount+
				", Withdraw completed...");  
	}  

	/**
	 * 
	 * @param amount
	 */
	synchronized void deposit(int amount){  
		System.out.println("Going to deposit...");  
		this.amount+=amount;  
		System.out.println("Deposit completed... ");  
		notify();  
	}

}  
