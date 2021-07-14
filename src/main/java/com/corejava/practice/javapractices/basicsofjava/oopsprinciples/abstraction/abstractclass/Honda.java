package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.abstractclass;

/**
 * 
 * @author Administrator
 *
 */
public class Honda extends Bike {

	@Override
	public void run() {
		System.out.println("running safely");
	}

	@Override
	public void gear() {
		System.out.println("gear changed...");
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Bike bike = new Honda();
		
		bike.run();
		bike.gear();
	}



}
