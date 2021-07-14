package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class CallRunMethodDirectlyExample2 extends Thread {

	@Override
	public void run() {
		for(int i=1; i<5; i++){  
			try{  
				Thread.sleep(500);  
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
		JoinMethodForThread joinMethodForThread1 = 
				new JoinMethodForThread();
		JoinMethodForThread joinMethodForThread2 = 
				new JoinMethodForThread();
		JoinMethodForThread joinMethodForThread3 = 
				new JoinMethodForThread();

		joinMethodForThread1.run();
		joinMethodForThread2.run();
		joinMethodForThread3.run();	
	}
}
