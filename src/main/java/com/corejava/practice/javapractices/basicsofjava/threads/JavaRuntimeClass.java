package com.corejava.practice.javapractices.basicsofjava.threads;

import java.io.IOException;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaRuntimeClass {

	/**
	 * Open a new Notepad 
	 * 
	 * @param runtime
	 */
	public void openANewNotepad(Runtime runtime) {
		try {
			runtime.exec("notepad");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	/**
	 * Shutdown the system in Java
	 * 
	 * @param runtime
	 */
	public void shutdownTheSystem(Runtime runtime) {
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
	public void restartSystem(Runtime runtime) {
		try {
			runtime.exec("shutdown -r -t 0");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

	/**
	 * Available Processors
	 * 
	 * @param runtime
	 */
	public void availableProcessors(Runtime runtime) {
		System.out.println("Available Processors: "+runtime.availableProcessors());
	}

	/**
	 * 
	 * @param runtime
	 */
	public void getMemoryInfo(Runtime runtime) {
		System.out.println("********** Memory Information **********");

		System.out.println("Total Memory: "+runtime.totalMemory());  
		System.out.println("Free Memory: "+runtime.freeMemory());  

		for(int i=0;i<10000;i++){  
			new JavaRuntimeClass();  
		} 

		System.out.println("After creating 10000 instance, Free Memory: "+runtime.freeMemory());  
		System.gc();  
		System.out.println("After gc(), Free Memory: "+runtime.freeMemory());  
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		JavaRuntimeClass javaRuntimeClass = new JavaRuntimeClass();	
		Runtime runtime = Runtime.getRuntime(); 

		javaRuntimeClass.openANewNotepad(runtime);
		//javaRuntimeClass.shutdownTheSystem(runtime);
		//javaRuntimeClass.restartSystem(runtime);
		javaRuntimeClass.availableProcessors(runtime);
		javaRuntimeClass.getMemoryInfo(runtime);
	}
}
