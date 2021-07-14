package com.corejava.practice.javapractices.basicsofjava.java8.stringjoinmethod;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component("stringjoinmethod")
public class StringJoinMethod {

	/**
	 * 
	 */
	public void StringJoinDemo(){
		String joined = String.join("/","usr","local","bin");
		System.out.println("***********************************");
		System.out.println(joined);
		System.out.println("***********************************");
	}


}
