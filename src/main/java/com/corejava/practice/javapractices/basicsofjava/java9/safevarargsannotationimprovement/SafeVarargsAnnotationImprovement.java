package com.corejava.practice.javapractices.basicsofjava.java9.safevarargsannotationimprovement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 
 * @author Administrator
 *
 */
@Service("safeVarargsAnnotationImprovement")
public class SafeVarargsAnnotationImprovement {

	/**
	 * 
	 * @param products
	 * 
	 * Applying @SaveVarargs annotation 
	 */ 
	@SafeVarargs  
	private void safeVarargsAnnotationOnPrivateInstanceMethod(String firstpram,List<String>... listOfproducts) {
		for (List<String> product : listOfproducts) {  
			System.out.println(product);  
		}  
	}  

	/**
	 * 
	 */
	public void safeVarargsAnnotationPrivateInstanceMethodImpl() {
		/**
		 * 
		 */
		List<String> listOfproducts = new ArrayList<String>();  
		listOfproducts.add("Laptop");  
		listOfproducts.add("Tablet");  
		safeVarargsAnnotationOnPrivateInstanceMethod("firstPram",listOfproducts);  
	}     

}

