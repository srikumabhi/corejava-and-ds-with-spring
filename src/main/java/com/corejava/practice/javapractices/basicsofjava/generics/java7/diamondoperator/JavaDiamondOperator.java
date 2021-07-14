package com.corejava.practice.javapractices.basicsofjava.generics.java7.diamondoperator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 *
 */
@Component("javadiamondoperator")
public class JavaDiamondOperator {

	public void javaDiamondOperatorExample() {
		
		/**
		 * Before generics –> raw type declarations
		 */
		Map mapRawType = new HashMap(); 
		// WARN:-Map is a raw type. References to generic type Map<K,V> should be parameterized.
		mapRawType.put("mapRawType",1);
		System.out.println(mapRawType);

		/**
		 * Generics –> parameterized types
		 */
		Map<String, Integer> mapParameterizedTypes = new HashMap<String, Integer>();
		mapParameterizedTypes.put("mapParameterizedTypes",2);
		System.out.println(mapParameterizedTypes);
		
		/**
		 * Java DiamondOperator/Elvis operator (After Java-7)
		 */
		Map<String, Integer> mapUsingDiamondOperator = new HashMap<>();
		mapUsingDiamondOperator.put("mapUsingDiamondOperator", 3);
		System.out.println(mapUsingDiamondOperator);

	}

}
