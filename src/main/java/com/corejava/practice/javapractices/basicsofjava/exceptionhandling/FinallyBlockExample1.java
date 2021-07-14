package com.corejava.practice.javapractices.basicsofjava.exceptionhandling;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class FinallyBlockExample1 extends Thread {
	public void run(){
		/* Logic inside the run-method... */
		System.out.println("thread is running..."); 

		try{  
			int arithmeticOprationData=25/0;  
			System.out.println(arithmeticOprationData);  
		}  
		catch(NullPointerException ex){
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
		FinallyBlockExample1 finallyBlockExample1 = 
				new FinallyBlockExample1();
		finallyBlockExample1.start();
	}
}
