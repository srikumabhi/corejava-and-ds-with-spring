package com.corejava.practice.dspractices.array;

import java.math.BigInteger;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class LargeFactorial {
	/**
	 * 
	 * @param a
	 * @param n
	 * @return
	 */
	public long[] factorial(long a[], int n) {
		for(int i=0; i<n; i++) {
			a[i] = getFactorialOfithElementExample5(a[i]);
		}
		for(long element:a) {
			System.out.println("Element:"+element);
		}
		return a;
	}
	
	public static long getFactorialOfithElementExample1(long n) {
		if (n == 0)
			return 1;

		return n*getFactorialOfithElementExample1(n-1);
	}
	public static long getFactorialOfithElementExample2(long n) {
		long i, factorial=1;
		for(i = 1; i<=n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	public static long getFactorialOfithElementExample3(long n) {
		long i, factorial=1;
		for(i = 1; i<=n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	public static long getFactorialOfithElementExample4(long n){
		// single line to find factorial
		return (n == 1 || n == 0) ? 1 : n * getFactorialOfithElementExample4(n - 1);
	}
	// Returns Factorial of N
	public static long getFactorialOfithElementExample5(long N){
		// Initialize result
		BigInteger bigInteger
		= new BigInteger("1"); // Or BigInteger.ONE

		// Multiply f with 2, 3, ...N
		for (int i = 2; i <= N; i++)
			bigInteger = bigInteger.multiply(BigInteger.valueOf(i));

		return bigInteger.longValue();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//long a[]= new long[] {0, 1, 2, 3, 4};
		long a[] = new long [] {20, 6, 3};
		new LargeFactorial().factorial(a, a.length);
	}

}
