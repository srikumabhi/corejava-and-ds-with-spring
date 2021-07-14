package com.corejava.practice.javapractices.basicsofjava.statickeyword;

//import org.springframework.stereotype.Service;

/**
 * 
 * @author abhishek-sriv
 *
 */
//@Service("childofstaticmethodorclassmethod")
public class ChildOfStaticMethodOrClassMethod extends StaticMethodOrClassMethod {
	
	/* Static block */
	static{
		System.out.println("1st static block in ChildOfStaticMethodOrClassMethod class");
	}
	
	/* Static block */
	static{
		System.out.println("2nd static block in ChildOfStaticMethodOrClassMethod class");
		ChildOfStaticMethodOrClassMethod.college="IMS";
	}

	/**
	 * 
	 * @param r
	 * @param n
	 */
	ChildOfStaticMethodOrClassMethod(int r, String n) {
		super(r, n);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("In main method, in ChildOfStaticMethodOrClassMethod class");

		/**
		 * 
		 */
		ChildOfStaticMethodOrClassMethod childOfStaticMethodOrClassMethod = new
				ChildOfStaticMethodOrClassMethod(100, "Abhishek Kumar Srivastava");
		childOfStaticMethodOrClassMethod.display();

		/**
		 *
		 */
		ChildOfStaticMethodOrClassMethod.displayUseForStatic();
		System.out.println(""+ChildOfStaticMethodOrClassMethod.college);
	}

}
