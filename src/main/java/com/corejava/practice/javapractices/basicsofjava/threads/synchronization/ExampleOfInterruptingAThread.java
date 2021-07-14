package com.corejava.practice.javapractices.basicsofjava.threads.synchronization;

import java.io.IOException;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class ExampleOfInterruptingAThread implements Runnable{

	@Override
	public void run() {

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
			for(int j=1; j<=5; j++){
				if(Thread.currentThread().isDaemon()) {
					System.out.println(Thread.currentThread().getName()+" is a daemon-thread.");
				} else {
					System.out.println(Thread.currentThread().getName());
				}
				System.out.println(100*j);

				try{  
					Thread.sleep(5000);  
				}catch(Exception ex){
					System.out.println(ex);
				}  
			}  
		}
		System.out.println("*** Synchronized block end ***");
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ExampleOfInterruptingAThread exampleOfInterruptingAThread1 = new 
				ExampleOfInterruptingAThread();
		Thread thread1 = new Thread(exampleOfInterruptingAThread1);

		ExampleOfInterruptingAThread exampleOfInterruptingAThread2 = new 
				ExampleOfInterruptingAThread();
		Thread thread2 = new Thread(exampleOfInterruptingAThread2);

		System.out.println("Thread interrupted:-"+Thread.interrupted());
		thread1.setName("Interrupted-Thread");
		thread1.start();
		thread1.interrupt();
		System.out.println("Is thread interrupted:-"+thread1.isInterrupted());

		thread2.start();
	}

}
