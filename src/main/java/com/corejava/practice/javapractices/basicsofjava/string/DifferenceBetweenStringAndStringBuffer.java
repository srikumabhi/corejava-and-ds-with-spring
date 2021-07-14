package com.corejava.practice.javapractices.basicsofjava.string;

/**
 * @author abhishek-sriv
 * @see https://www.javatpoint.com/difference-between-string-and-stringbuffer
 */
public class DifferenceBetweenStringAndStringBuffer {

	/**
	 * 
	 * @return
	 */
	public static DifferenceBetweenStringAndStringBuffer getInstance() {
		return new DifferenceBetweenStringAndStringBuffer();
	}

	/**
	 * 
	 */
	public void performanceTestOfStringAndStringBuffer() {

		long startTime = System.currentTimeMillis();  
		concatWithString();  
		System.out.println("Time taken by Concating with String: "+
				(System.currentTimeMillis()-startTime)+"ms");  

		startTime = System.currentTimeMillis();  
		concatWithStringBuffer();  
		System.out.println("Time taken by Concating with  StringBuffer: "+
				(System.currentTimeMillis()-startTime)+"ms");  
	}

	/**
	 * 
	 * @return
	 */
	public static String concatWithString(){  
		String t = "Java";  
		for (int i=0; i<10000; i++){  
			t = t + "DevelopersBeenWithDefaultEqualsAndHashCodeMethod";  
		}  
		return t;  
	}

	/**
	 * 
	 * @return
	 */
	public static String concatWithStringBuffer(){  
		StringBuffer sb = new StringBuffer("Java");  
		for (int i=0; i<10000; i++){  
			sb.append("DevelopersBeenWithDefaultEqualsAndHashCodeMethod");  
		}  
		return sb.toString();  
	}  

	/**
	 * 
	 */
	public void stringAndStringBufferHashCodeTest() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		System.out.println("Hashcode test of String:");  
		String string="Java";  
		System.out.println(string.hashCode());  
		string = string+"DevelopersBeenWithDefaultEqualsAndHashCodeMethod";  
		System.out.println(string.hashCode());  

		System.out.println("Hashcode test of StringBuffer:");  
		StringBuffer stringBuffer = new StringBuffer("Java");  
		System.out.println(stringBuffer.hashCode());  
		stringBuffer.append("DevelopersBeenWithDefaultEqualsAndHashCodeMethod");  
		System.out.println(stringBuffer.hashCode()); 

		/*
		 * try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
		 * 
		 * System.out.println("Lock/Monitor has been relesed..."); notify();
		 */  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread() {  
			public void run() {
				synchronized(this) {
					DifferenceBetweenStringAndStringBuffer.getInstance().
					performanceTestOfStringAndStringBuffer();
				}
			}  
		}; 

		Thread thread2 = new Thread() {  
			public void run() {  
				synchronized(this) {
					DifferenceBetweenStringAndStringBuffer.getInstance().
					stringAndStringBufferHashCodeTest();
				}
			}  
		};

		thread1.start();
		thread2.start();
	}
}
