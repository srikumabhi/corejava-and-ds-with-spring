package com.corejava.practice.javapractices.basicsofjava.threads;

import java.io.IOException;

/**
 * 
 * @author abhishek-sriv
 *
 */
class Example1OfShutdownHook extends Thread{

	public void run(){ 
		for(int i=1; i<10; i++){  
			try{  
				//Thread.sleep(500);  
			}catch(Exception ex){
				System.out.println(ex);
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);  
		} 
		System.out.println("shut down hook task completed..");  
	} 

	/**
	 * Shutdown the system in Java
	 * 
	 * @param runtime
	 */
	public void shutdownTheSystem(Runtime runtime){
		try {
			runtime.exec("shutdown -s -t 0");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	/**
	 * Restart system in Java
	 * 
	 * @param runtime
	 */
	public void restartSystem(Runtime runtime){
		try {
			runtime.exec("shutdown -r -t 0");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args)throws Exception{  

		Runtime runtime = Runtime.getRuntime();  
		runtime.addShutdownHook(new Example1OfShutdownHook());  

		try{
			while(true) {
				System.out.println("Implementation of ShutdownHook..."); 
				//new Example1OfShutdownHook().shutdownTheSystem(runtime);
				//new Example1OfShutdownHook().restartSystem(runtime);
				System.exit(0);
			}
		}catch (Exception ex) {
			System.out.println(ex);
		}  
	}

}
