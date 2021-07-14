package com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression;

import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 *
 */
@Component("javalambdaexpressiontypeinference")
public class JavaLambdaExpressionTypeInference {

	interface StringLengthLambda {
		int getLength(String s);
	}

	public void printLambda(StringLengthLambda stringLengthLambda) {
		System.out.println(stringLengthLambda.getLength("Abhishek Kumar Srivastava"));
	}

	public void useOfStringLengthLambda() {
		printLambda(s->s.length());
	}

}
