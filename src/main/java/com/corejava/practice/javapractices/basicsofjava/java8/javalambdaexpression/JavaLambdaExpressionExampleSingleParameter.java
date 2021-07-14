package com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component("javalambdaexpressionexamplesingleparameter")
public class JavaLambdaExpressionExampleSingleParameter {

	@FunctionalInterface  //It is optional  
	interface practices {
		public String sayForPractices(String exampleText);
	}
	public void javaLambdaExpressionExample1SingleParameter() {
		practices practices1 = (exampleText)-> {
			return "Java LambdaExpression SingleParameter =>"+exampleText;
		};
		System.out.println(practices1.sayForPractices("Example-1"));

		/** We can omit function parentheses. */
		practices practices2 = exampleText -> {
			return "Java LambdaExpression SingleParameter =>"+exampleText;
		};
		System.out.println(practices2.sayForPractices("Example-2, We can omit function parentheses"));
	}

}
