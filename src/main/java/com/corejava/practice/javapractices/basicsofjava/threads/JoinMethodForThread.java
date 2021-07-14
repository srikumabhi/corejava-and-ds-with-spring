package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JoinMethodForThread implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=10; i++){  
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

		/* */
		thread1.start();
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.setName("1st Thread With Join-Method");
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//thread1.start();

		/* */
		thread2.setPriority(Thread.NORM_PRIORITY);
		thread2.setName("2nd Thread");
		thread2.start();

		/* */
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread3.setName("3rd Thread");
		thread3.start();
	}
}
