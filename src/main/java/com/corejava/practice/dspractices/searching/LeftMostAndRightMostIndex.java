package com.corejava.practice.dspractices.searching;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class LeftMostAndRightMostIndex {
	class pair {  
		long first, second;  
		public pair(long first, long second) {  
			this.first = first;  
			this.second = second;  
		}  
	}
	/**
	 * 
	 * @param v
	 * @param x
	 * @return
	 */
	public pair indexes(long v[], long x) {
		long first=-1, second=-1;
		int length = v.length;

		for(int i=0; i<length; i++) {
			if((v[i]==x) && (first==-1)) {
				first=i;
				break;
			}
			/*
			 * if((i!=0) && (v[i-1]==x) && (v[i]!=x) && (second==-1)) { second=(i-1); }
			 */
		}
		for(int j=length-1; j>=0; j--) {
			if((v[j]==x) && (second==-1)) {
				second=j;
				break;
			}
		}
		System.out.println("First "+first +", "+"Second "+second);
		return new pair(first, second);
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long[] v = new long[] {1, 3, 5, 5, 5, 5, 67, 123, 125};
		long x = 5;
		//long[] v = new long[] {2, 3, 4};
		//long x = 4;
		new LeftMostAndRightMostIndex().indexes(v, x);
	}
}


