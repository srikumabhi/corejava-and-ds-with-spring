package com.corejava.practice.javapractices.basicsofjava.controlstatements.java7.switchcasewithstring;

import org.springframework.stereotype.Service;

/**
 * 
 * @author abhishek-sriv
 *
 */
@Service("javaswitchcasewithstring")
public class JavaSwitchCaseWithString {
	
	/**
	 * 
	 * @param token
	 * @return
	 */
	public String switchCaseWithString(final String token) {

		String value = null;

		switch (token) 
		{
		case ("one"):
			value = "Token one identified";
		break;

		case ("two"):
			value = "Token two identified";
		break;

		case ("three"):
			value = "Token three identified";
		break;

		case ("four"):
			value = "Token four identified";
		break;

		default:
			value = "No token was identified";
		}

		System.out.println(value);
		return value;
	}

	/**
	 * 
	 * @param token
	 * @return
	 */
	public String switchCaseHandleMultipleConditions(final String token) {
		String value = null;

		switch (token) 
		{
		case ("one"):
		case ("three"):
			value = "Odd token identified";
		break;

		case ("two"):
		case ("four"):
			value = "Even token identified";
		break;

		default:
			value = "No token was identified";
		}

		System.out.println(value);
		return value;
	}

}
