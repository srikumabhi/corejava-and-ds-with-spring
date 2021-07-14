package com.corejava.practice.javapractices.basicsofjava.datatypes;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class PrimitiveDataTypes {
	/*
Data Type	Default Value	 Default size
boolean	      false	          1 bit
char	     '\u0000'	      2 byte
byte	       0	          1 byte
short	       0	          2 byte
int	           0	          4 byte
long	      0L	          8 byte
float	     0.0f	          4 byte
double	     0.0d	          8 byte
	 */

	// Boolean Data Type
	Boolean booleanDataType1 = false; // Default Value
	Boolean booleanDataType2 = true;

	// Byte Data Type
	byte byteDefaultValue = 0; // Default Value
	byte byteDataType1 = 10; 
	byte byteDataType2 = -20;

	// Short Data Type
	short shortDefaultValue = 0; // Default Value
	short shortDataType1 = 10000; 
	short shortDataType2 = -5000;

	// Int Data Type
	int intDefaultValue = 0; // Default Value
	int intDataType1 = 100000; 
	int intDataType2 = -200000;

	// Long Data Type
	long longDefaultValue = 0L; // Default Value
	long longDataType1 = 100000L;
	long longDataType2 = -200000L;

	// Float Data Type
	float floatDefaultValue = 0.0f; // Default Value
	float floatDataType1 = 234.5f;
	float floatDataType2 = 534.5f;

	// Double Data Type
	double doubleDefaultValue = 0.0d; // Default Value
	double doubleDataType1 = 12.3;
	double doubleDataType2 = 24.6;

	/*
	 * Why char uses 2 byte in java and what is \u0000 ?
	 *  It is because java uses Unicode-System not ASCII code system. 
	 *  The \u0000 is the lowest range of Unicode-System.
	 */
	//Char Data Type
	char charDefaultValue ='\u0000'; // Default Value or lowest value
	char charHighestValue ='\uFFFF'; // Highest Value
	char letterA = 'A';
	char letterB = 'B';

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		PrimitiveDataTypes primitiveDataTypes = new PrimitiveDataTypes();

		System.out.println("booleanDataType1=> "+primitiveDataTypes.byteDataType1);
		System.out.println("booleanDataType2=> "+primitiveDataTypes.byteDataType2);
		
		System.out.println("shortDefaultValue=> "+primitiveDataTypes.shortDefaultValue);
		System.out.println("shortDataType1=> "+primitiveDataTypes.shortDataType1);
		System.out.println("shortDataType2=> "+primitiveDataTypes.shortDataType2);

		System.out.println("intDefaultValue=> "+primitiveDataTypes.intDefaultValue);
		System.out.println("intDataType1=> "+primitiveDataTypes.intDataType1);
		System.out.println("intDataType2=> "+primitiveDataTypes.intDataType2);

		System.out.println("longDefaultValue=> "+primitiveDataTypes.longDefaultValue);
		System.out.println("longDataType1=> "+primitiveDataTypes.longDataType1);
		System.out.println("longDataType2=> "+primitiveDataTypes.longDataType2);

		System.out.println("floatDefaultValue=> "+primitiveDataTypes.floatDefaultValue);
		System.out.println("floatDataType1=> "+primitiveDataTypes.floatDataType1);
		System.out.println("floatDataType2=> "+primitiveDataTypes.floatDataType2);

		System.out.println("doubleDefaultValue=> "+primitiveDataTypes.doubleDefaultValue);
		System.out.println("doubleDataType1=> "+primitiveDataTypes.doubleDataType1);
		System.out.println("doubleDataType2=> "+primitiveDataTypes.doubleDataType2);

		System.out.println("charDefaultValue=> "+primitiveDataTypes.charDefaultValue);
		System.out.println("charHighestValue=> "+primitiveDataTypes.charHighestValue);
		System.out.println("letterA=> "+primitiveDataTypes.letterA);
		System.out.println("letterB=> "+primitiveDataTypes.letterB);
	}

}
