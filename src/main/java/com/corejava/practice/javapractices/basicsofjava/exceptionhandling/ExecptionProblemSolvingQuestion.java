package com.corejava.practice.javapractices.basicsofjava.exceptionhandling;

public class ExecptionProblemSolvingQuestion {

	//@SuppressWarnings("finally")
	public int Problem1() {
		try {
			return 5;
		} catch (Exception e) {
			return 6;
		}
		finally {
			return 7;
		}
	}

	public static void main(String[] args) {
		int res = new ExecptionProblemSolvingQuestion().Problem1();
		System.out.println("res==>"+res);;
	}
}
