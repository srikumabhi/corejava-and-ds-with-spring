package com.corejava.practice.javapractices.basicsofjava.threads;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class CreateThreadByImplementingRunnableInterface implements Runnable{

	@Override
	public void run() {
		/* Logic inside the run-method... */
		System.out.println("thread is running..."); 

		try{  
			int arithmeticOprationData=25/0;  
			System.out.println(arithmeticOprationData);  
		}  
		catch(ArithmeticException ex){
			System.out.println(ex);
		}  
		finally{
			System.out.println("Thread has been executed. "
					+ "Finally block is always executed..");
		}
		/* End of the logic, inside the run-method... */
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CreateThreadByImplementingRunnableInterface 
		createThreadByImplementingRunnableInterface = new 
		CreateThreadByImplementingRunnableInterface();

		Thread thread = new Thread(createThreadByImplementingRunnableInterface);

		thread.start();
	}
}
