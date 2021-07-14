package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

import java.io.IOException;

/**
 * Synchronization is a mechanism to achieve thread safe.
 * @author abhishek-sriv
 *
 */
public class ExampleOfJavaSynchronized {

	/**
	 * Example of static-synchronization
	 * 
	 * @param n
	 */
	public synchronized static void staticSynchronization(int n){  
		for(int k=1; k<=10; k++){ 
			if(Thread.currentThread().isDaemon()) {
				System.out.println(Thread.currentThread().getName()+" is a daemon-thread.");
			} else {
				System.out.println(Thread.currentThread().getName());
			}
			System.out.println(n*k);

			try{  
				Thread.sleep(300);  
			}catch(Exception ex){
				System.out.println(ex);
			}  
		}  
	}

	/**
	 * Example of synchronized-method  
	 * 
	 * @param n
	 */
	public synchronized void synchronizedMethod(int n){
		for(int i=1; i<=10; i++){

			System.out.println(n*i);

			try{  
				Thread.sleep(400);  
			}catch(Exception ex){
				System.out.println(ex);
			}  
		}  
	}

	/**
	 * Example of synchronized-block
	 * 
	 * @param n
	 */
	public void synchronizedBlock(int n){

		Runtime runtime = Runtime.getRuntime(); 
		System.out.println("Available Processors: "+
				runtime.availableProcessors());
		try {
			System.out.println(runtime.exec("notepad"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("********** Memory Information **********");
		System.out.println("Total Memory: "+runtime.totalMemory());  
		System.out.println("Free Memory: "+runtime.freeMemory());  

		System.out.println("*** Synchronized block ***");
		synchronized(this){ 
			for(int j=1; j<=10; j++){
				if(Thread.currentThread().isDaemon()) {
					System.out.println(Thread.currentThread().getName()+" is a daemon-thread.");
				} else {
					System.out.println(Thread.currentThread().getName());
				}
				System.out.println(n*j);

				try{  
					Thread.sleep(500);  
				}catch(Exception ex){
					System.out.println(ex);
				}  
			}  
		}
		System.out.println("*** Synchronized block end ***");
	}

}
