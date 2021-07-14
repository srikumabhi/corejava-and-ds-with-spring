package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation;

/**
 * @author abhishek-sriv
 * 
 * Read-Only class:-
 * A Java class which has only getter methods.
 */
public class ReadOnlyClass {

	private int developerId;
	private String developerName;
	private String developerEmailId;
	private String developerCompanyName;

	public int getDeveloperId() {
		return developerId;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public String getDeveloperEmailId() {
		return developerEmailId;
	}
	public String getDeveloperCompanyName() {
		return developerCompanyName;
	}
}
