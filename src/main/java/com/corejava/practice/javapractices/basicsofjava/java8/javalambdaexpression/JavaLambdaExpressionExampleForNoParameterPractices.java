package com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */  
@Component("javalambdaexpressionexamplefornoparameterpractices")
public class JavaLambdaExpressionExampleForNoParameterPractices {

	/**
	 * 
	 * 
	 *
	 */
	@FunctionalInterface  //It is optional  
	interface DrawableJavaLambdaExpressionExamplePractice1 {  
		public void draw();  
	}
	public void javaLambdaExpressionExample1ForNoParameter() {

		int width = 10;  

		//without lambda, DrawableJavaLambdaExpressionExamplePractice1 implementation using anonymous class  
		DrawableJavaLambdaExpressionExamplePractice1 drawableWithoutLambda = 
				new DrawableJavaLambdaExpressionExamplePractice1() {  
			public void draw() {
				System.out.println("Printing drawing without lambda {} :"+width);
			}  
		};  
		drawableWithoutLambda.draw();  

		//with lambda  
		DrawableJavaLambdaExpressionExamplePractice1 drawableWithLambda = ()-> {  
			System.out.println("Printing drawing with lambda {} :"+width);  
		};  
		drawableWithLambda.draw();

	}

	/**
	 * 
	 * 
	 *
	 */
	@FunctionalInterface  //It is optional  
	interface Sayable {  
		public String say();  
	}  
	public void javaLambdaExpressionExample2ForNoParameter() {
		//
		Sayable sayable1 =() -> {  
			return "I am saying nothing, Just working on java lambda-expression.";  
		};
		System.out.println(sayable1.say()); 

		//
		Sayable sayable2 =() ->"I am saying nothing, Just working on java lambda-expression.";  
		System.out.println(sayable2.say());
	}

	/**
	 * 
	 * 
	 *
	 */
	@FunctionalInterface
	interface NoParameter {
		public String practicesForNoParameter();
	}
	public void javaLambdaExpressionExample3ForNoParameter() {
		NoParameter noParameter = () -> {
			return "Java LambdaExpression Example For No Parameter Practices.";
		};
		System.out.println(noParameter.practicesForNoParameter());
	}

}

