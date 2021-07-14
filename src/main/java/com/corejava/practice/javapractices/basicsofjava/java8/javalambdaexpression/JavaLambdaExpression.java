package com.corejava.practice.javapractices.basicsofjava.java8.javalambdaexpression;

import org.springframework.stereotype.Component;

@FunctionalInterface  //It is optional  
interface DrawableJavaLambdaExpressionExample{  
	public void draw();  
}  

@FunctionalInterface //It is optional  
interface Sayable{  
	public String say();  
} 

@FunctionalInterface //It is optional  
interface SayableParameter{  
	public String say(String name);  
} 

@FunctionalInterface //It is optional 
interface Addable{  
	public int add(int a,int b);  
} 

/**
 * 
 * @author abhishek-sriv
 *
 */
@Component("javalambdaexpression")
public class JavaLambdaExpression {  

	public void javaLambdaExpressionExample() {

		//with lambda
		int width=10;  
		DrawableJavaLambdaExpressionExample 
		drawableJavaLambdaExpressionExample=()->{  
			System.out.println("Drawing "+width);  
		};  
		drawableJavaLambdaExpressionExample.draw();

		//with lambda
		Sayable sayable=()->{
			return "i am abhishek kumar srivastava";
		};
		System.out.println(sayable.say());

		//with lambda
		SayableParameter sayableParameter1=(name)->{
			return "NameBysayableParameter1="+name;
		};
		System.out.println(
				sayableParameter1.say("Abhishek Kumar Srivastava")
				);

		//with lambda
		SayableParameter sayableParameter2=name->{
			return "NameBysayableParameter2="+name;
		};
		System.out.println(
				sayableParameter2.say("Rinshu")
				);

		// Multiple parameters in lambda expression  
		Addable addable1=(a,b)->(a+b);  
		System.out.println(
				addable1.add(10,20)
				); 

		// Multiple parameters with data type in lambda expression  
		Addable addable2=(int a,int b)->(a+b);  
		System.out.println(
				addable2.add(100,200)
				); 

		// Lambda expression with return keyword.    
		Addable addable3=(int a,int b)->{  
			return (a+b);   
		};  
		System.out.println(
				addable3.add(1000,200)
				);  
	}  

}  
