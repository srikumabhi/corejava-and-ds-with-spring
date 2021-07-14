package com.corejava.practice.dspractices.math;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class TrailingZeroesInFactorial {
	/**
	 * 
	 * @param N
	 * @return
	 */
	public static int trailingZeroes(int N) {
		/**
		 * 
		 */
		int factOfN = getFactorial(N);
		System.out.println("Factorial:- "+factOfN);

		int trailingZeroes = 0;
		// Keep dividing n by powers
		// of 5 and update count
		for (int i=5; N/i>=1; i*=5) {
			trailingZeroes += N/i;
		}

		System.out.println("TrailingZeroes:-"+trailingZeroes);
		return trailingZeroes;
	}

	/**
	 * 
	 * @param N
	 * @return
	 */
	public static int getFactorial(int N) {
		int fact = N;
		for(int i=1; i<N; i++) {
			fact = fact*(N-i);
		}
		return fact;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		trailingZeroes(5);
	}
}
