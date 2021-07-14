package com.corejava.practice.javapractices.basicsofjava.string;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class StringExample1 implements Runnable{

	@Override
	public void run() {

		//creating string by java string literal  
		String string1 = "java";
		char charArray[] = {'s','t','r','i','n','g','s'}; 
		//converting char array to string  
		String string2 = new String(charArray);

		//creating java string by new keyword
		String string3 = new String("example"); 

		System.out.println(string1);  
		System.out.println(string2);  
		System.out.println(string3);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		StringExample1 stringExample1 = new StringExample1();
		Thread thread = new Thread(stringExample1);
		thread.start();
	}
}
