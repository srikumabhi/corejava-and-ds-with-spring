package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class DaemonThreadInJava implements Runnable {

	@Override
	public void run() {
		if(Thread.currentThread().isDaemon()){ //checking for daemon thread 
			for(int j=1; j<=3; j++){  
				try{  
					System.out.println("Daemon thread only..."); 
					Thread.sleep(300);  
				}catch(Exception ex){
					System.out.println(ex);
				} 
				System.out.println("Current-Thread=>"+Thread.currentThread());
				System.out.println(j);  
			} 
		}  
		else{  
			for(int i=1; i<=2; i++){  
				try{  
					System.out.println("User thread only...");  
					Thread.sleep(5000);  
				}catch(Exception ex){
					System.out.println(ex);
				}  
				System.out.println("Current-Thread=>"+Thread.currentThread());
				System.out.println(i);  
			}  
		}  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		DaemonThreadInJava daemonThread1InJava = new DaemonThreadInJava();
		Thread thread1 = new Thread(daemonThread1InJava);
		thread1.setName("1st daemon thread");
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread1.setDaemon(true);
		thread1.start();


		DaemonThreadInJava daemonThread2InJava = new DaemonThreadInJava(); 
		Thread thread2 = new Thread(daemonThread2InJava); 
		thread2.setDaemon(true);
		thread2.setName("2nd daemon thread"); 
		thread2.start();

		DaemonThreadInJava noDaemonThread1InJava = new DaemonThreadInJava(); 
		Thread thread3 = new Thread(noDaemonThread1InJava); 
		thread3.setDaemon(false);
		thread3.setName("1st user thread"); 
		thread3.start();

		DaemonThreadInJava noDaemonThread2InJava = new DaemonThreadInJava(); 
		Thread thread4 = new Thread(noDaemonThread2InJava); 
		thread4.setName("2nd user thread"); 
		try { 
			thread4.join(); 
		} catch(InterruptedException e) { 
			e.printStackTrace(); 
		}
		thread4.setPriority(Thread.MIN_PRIORITY);
		thread4.start();
	}
}
