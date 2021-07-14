package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation;

/**
 * @author abhishek-sriv
 * 
 * Write-Only class:-
 * A Java class which has only setter methods.  
 */
public class WriteOnlyClass {

	private int developerId;
	private String developerName;
	private String developerEmailId;
	private String developerCompanyName;

	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public void setDeveloperEmailId(String developerEmailId) {
		this.developerEmailId = developerEmailId;
	}
	public void setDeveloperCompanyName(String developerCompanyName) {
		this.developerCompanyName = developerCompanyName;
	}
}
