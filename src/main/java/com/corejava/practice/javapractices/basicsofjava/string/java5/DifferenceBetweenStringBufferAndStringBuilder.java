package com.corejava.practice.javapractices.basicsofjava.string.java5;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class DifferenceBetweenStringBufferAndStringBuilder {
	/**
	 * 
	 */
	public void performanceTestOfStringBufferAndStringBuilder() {
		long startTime = System.currentTimeMillis();  
		StringBuffer sb = new StringBuffer("Java");  
		for (int i=0; i<10000; i++){  
			sb.append("Developer");  
		}  
		System.out.println("Time taken by StringBuffer: " + 
				(System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();  
		StringBuilder sb2 = new StringBuilder("Java");  
		for (int i=0; i<10000; i++){  
			sb2.append("Developer");  
		}  
		System.out.println("Time taken by StringBuilder: " + 
				(System.currentTimeMillis() - startTime) + "ms");  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread() {  
			public void run() {
				synchronized(this) {
					new DifferenceBetweenStringBufferAndStringBuilder().
					performanceTestOfStringBufferAndStringBuilder();
				}
			}  
		};
		thread1.start();
	}
}
