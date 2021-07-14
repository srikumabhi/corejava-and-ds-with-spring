package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.abstraction.javainterface.interfaceenhancement.java8;

/**
 * 
 * @author Administrator
 *
 */
@FunctionalInterface
public interface InterfaceInJava {

	/**
	 * 
	 * @author Administrator
	 *
	 */
	class ClassInsideTheInterface{

		/**
		 * 
		 * @author Administrator
		 *
		 */
		@FunctionalInterface
		public interface JavaInnerInterfaceInClass{  
			void msg();  
		}
		
	}  

	/**
	 * 
	 * @author Administrator
	 *
	 */
	@FunctionalInterface 
	public interface JavaNestedInterface{  

		void print();  

		/**
		 * 
		 * @author Administrator
		 *
		 */
		@FunctionalInterface
		public interface JavaInnerInterface{  
			void msg();  
		}

	} 

	/**
	 * 
	 */
	public void abstractMethod(); 

	/**
	 * 
	 */
	default void callThePrivateInterfaceMethods() { 
		/**
		 * Calling private method
		 */
		privateMethodInsideInterface(); 

		/**
		 * Calling private static method  
		 */
		privateStaticMethodInsideInterface(); 
	}  

	/**
	 * Private method inside interface
	 */
	private void privateMethodInsideInterface() {  
		System.out.println("Hello... I'm private method");  
	}  

	/**
	 *  Private static method inside interface
	 */
	private static void privateStaticMethodInsideInterface() {  
		System.out.println("I'm private static method");  
	} 

	/**
	 *  Public static method inside interface
	 */
	public static void publicStaticMethodInsideInterface() {  
		System.out.println("I'm private static method");  
	}

}
