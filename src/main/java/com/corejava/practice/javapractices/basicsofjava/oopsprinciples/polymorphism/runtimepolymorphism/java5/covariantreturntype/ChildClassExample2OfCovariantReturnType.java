package 
com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.runtimepolymorphism.java5.covariantreturntype;

public class ChildClassExample2OfCovariantReturnType extends SuperClassExampleOfCovariantReturnType {
	/** */
	//public String get(){
	public ChildClassExample2OfCovariantReturnType get(){
		//return "Abhishek Kumar Srivastava";
		return this;
	}
}
