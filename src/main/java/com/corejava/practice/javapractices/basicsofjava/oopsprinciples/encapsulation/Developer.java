package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.encapsulation;

import java.io.Serializable;

/**
 * A Java class which is a fully encapsulated class. It has a private data member
   and getter and setter methods.
 * The Java Bean class is the example of a fully encapsulated class.
 * 
 * @author abhishek-sriv
 * @see ExampleOfEncapsulationInJava
 */
public class Developer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int developerId;
	private String developerName;
	private String developerEmailId;
	private String developerCompanyName;

	public Developer() {
		super();
	}

	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	public String getDeveloperName() {
		return developerName;
	}
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	public String getDeveloperEmailId() {
		return developerEmailId;
	}
	public void setDeveloperEmailId(String developerEmailId) {
		this.developerEmailId = developerEmailId;
	}
	public String getDeveloperCompanyName() {
		return developerCompanyName;
	}
	public void setDeveloperCompanyName(String developerCompanyName) {
		this.developerCompanyName = developerCompanyName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developerCompanyName == null) ? 0 : developerCompanyName.hashCode());
		result = prime * result + ((developerEmailId == null) ? 0 : developerEmailId.hashCode());
		result = prime * result + developerId;
		result = prime * result + ((developerName == null) ? 0 : developerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		if (developerCompanyName == null) {
			if (other.developerCompanyName != null)
				return false;
		} else if (!developerCompanyName.equals(other.developerCompanyName))
			return false;
		if (developerEmailId == null) {
			if (other.developerEmailId != null)
				return false;
		} else if (!developerEmailId.equals(other.developerEmailId))
			return false;
		if (developerId != other.developerId)
			return false;
		if (developerName == null) {
			if (other.developerName != null)
				return false;
		} else if (!developerName.equals(other.developerName))
			return false;
		return true;
	}

}
