package com.corejava.practice.javapractices.basicsofjava.string;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class ValidateAnIPAddress {
	/**
	 * 
	 * @param s
	 * @return
	 */
	public boolean isValid(String s) {
		try {
			String[] arr = s.split("\\.");
			if(4!=arr.length) {
				return false;
			}
			for(String str : arr) {
				if(str.isEmpty() || str.isBlank()) {
					return false;
				} else {
					int dnum = Integer.valueOf(str);
					if(0>dnum || dnum>255 || dnum % 10 == 0) {
						return false;	
					}
				}
			}
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(
				new ValidateAnIPAddress().isValid("67.53.56.29"));
	}
}
