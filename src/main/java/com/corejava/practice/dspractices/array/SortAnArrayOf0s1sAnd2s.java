package com.corejava.practice.dspractices.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class SortAnArrayOf0s1sAnd2s implements Callable<int []> {

	public int arr[];
	
	public SortAnArrayOf0s1sAnd2s() {
	}
	public SortAnArrayOf0s1sAnd2s(int[] arr) {
		this.arr = arr;
	}

	@Override
	public int [] call() throws Exception {
		return new SortAnArrayOf0s1sAnd2s().sort012Example2(arr, arr.length);
	}
	/**
	 * 
	 * @param a
	 * @param n
	 */
	public int [] sort012Example2(int a[], int n) {
		Arrays.parallelSort(a);
		return a;
	}
	/**
	 * 
	 * @param a
	 * @param n
	 */
	public void sort012Example1(int a[], int n) {                                          
		int unstortedPartitionIndex = (n-1);

		int j=1;
		for (int i=0 ; i<n && j<n; i++) {
			if(a[i]>a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			j++;
		}

		unstortedPartitionIndex--;
		if(unstortedPartitionIndex>0) {
			sort012Example1(a, n-1);
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.
				newFixedThreadPool(10);
		List<Future<int[]>> resultList = new ArrayList<>();
		Collections.synchronizedList(resultList);

		int arr[] = new int[] {0, 2, 1, 2, 0};
		SortAnArrayOf0s1sAnd2s sortAnArrayOf0s1sAnd2s = new 
				SortAnArrayOf0s1sAnd2s(arr);
		Future<int[]> result = threadPoolExecutor.submit(sortAnArrayOf0s1sAnd2s);
		resultList.add(result);

		for(Future<int[]> future : resultList){
			try {
				System.out.println("Future result is - " + " - " + future.get() + "; And Task done is " + future.isDone());
				for(int element : future.get()) {
					System.out.println(element);
				}
			} 
			catch (InterruptedException | ExecutionException e){
				e.printStackTrace();
			}
		}
		//shut down the executor service now
		threadPoolExecutor.shutdown();
	}

}
