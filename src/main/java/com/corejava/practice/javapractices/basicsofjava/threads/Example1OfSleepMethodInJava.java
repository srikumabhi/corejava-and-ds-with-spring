package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class Example1OfSleepMethodInJava implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<10; i++){  
			try{
				Thread.sleep(5000);
			}catch(InterruptedException ex){
				System.out.println(ex);
			}  
			System.out.println(i);  
		}  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Example1OfSleepMethodInJava exampleOfSleepMethodInJava1 = 
				new Example1OfSleepMethodInJava();
		Thread thread1 = new Thread(exampleOfSleepMethodInJava1);
		thread1.start();

		Example1OfSleepMethodInJava exampleOfSleepMethodInJava2 = 
				new Example1OfSleepMethodInJava();
		Thread thread2 = new Thread(exampleOfSleepMethodInJava2);
		thread2.start();
	}
}
