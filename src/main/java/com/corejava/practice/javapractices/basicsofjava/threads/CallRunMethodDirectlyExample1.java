package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class CallRunMethodDirectlyExample1 implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=5; i++){  
			try{  
				Thread.sleep(5000);  
			}catch(Exception ex){
				System.out.println(ex);
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);  
		}  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JoinMethodForThread joinMethodForThread1 = new JoinMethodForThread();
		Thread thread1 = new Thread(joinMethodForThread1);

		JoinMethodForThread joinMethodForThread2 = new JoinMethodForThread();
		Thread thread2 = new Thread(joinMethodForThread2);

		JoinMethodForThread joinMethodForThread3 = new JoinMethodForThread();
		Thread thread3 = new Thread(joinMethodForThread3);

		thread1.run();
		thread2.run();
		thread3.run();	
	}
}
