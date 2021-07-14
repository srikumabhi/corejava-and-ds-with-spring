package com.corejava.practice.javapractices.basicsofjava.java9.anonymousinnerclassesimprovement;

import org.springframework.stereotype.Service;

/**
 * 
 * @author Administrator
 *
 */
@Service("anonymousInnerClasseImprovement")
public class AnonymousInnerClasseImprovement {

	/**
	 * 
	 */
	public void anonymousInnerClasseImprovementImplExample1() {

		/**
		 * Diamond operator is not empty.
		 */
		AbstractClasse<String> abstractClasse = 
				new AbstractClasse<String>() {  

			@Override
			String anonymousInnerClasseMeth(String inputparm1, String inputparam2) {
				return ( inputparm1 + inputparam2 );
			}  
		};  

		String result = abstractClasse.anonymousInnerClasseMeth("Anonymous Inner Classes Improvement",
				"In Java-9 Example1"); 

		System.out.println(result);  

	}

	/**
	 * 
	 */
	public void anonymousInnerClasseImprovementImplExample2() {

		/**
		 * Diamond operator is empty.
		 */
		AbstractClasse<String> abstractClasse = 
				new AbstractClasse<>() {  

			@Override
			String anonymousInnerClasseMeth(String inputparm1, String inputparam2) {
				return ( inputparm1 + inputparam2 );
			}  
		};  

		String result = abstractClasse.anonymousInnerClasseMeth("Anonymous Inner Classes Improvement",
				"In Java-9 Example2"); 

		System.out.println(result);  

	}

}
