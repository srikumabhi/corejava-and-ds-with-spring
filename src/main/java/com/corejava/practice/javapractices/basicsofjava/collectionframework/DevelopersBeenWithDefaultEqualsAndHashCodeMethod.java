package com.corejava.practice.javapractices.basicsofjava.collectionframework;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class DevelopersBeenWithDefaultEqualsAndHashCodeMethod {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int developerId;
	private String developerName;
	private String developerEmailId;
	private String developerCompanyName;

	/**
	 * @return the developerId
	 */
	public int getDeveloperId() {
		return developerId;
	}
	/**
	 * @param developerId the developerId to set
	 */
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	/**
	 * @return the developerName
	 */
	public String getDeveloperName() {
		return developerName;
	}
	/**
	 * @param developerName the developerName to set
	 */
	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}
	/**
	 * @return the developerEmailId
	 */
	public String getDeveloperEmailId() {
		return developerEmailId;
	}
	/**
	 * @param developerEmailId the developerEmailId to set
	 */
	public void setDeveloperEmailId(String developerEmailId) {
		this.developerEmailId = developerEmailId;
	}
	/**
	 * @return the developerCompanyName
	 */
	public String getDeveloperCompanyName() {
		return developerCompanyName;
	}
	/**
	 * @param developerCompanyName the developerCompanyName to set
	 */
	public void setDeveloperCompanyName(String developerCompanyName) {
		this.developerCompanyName = developerCompanyName;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "DevelopersBeenWithDefaultEqualsAndHashCodeMethod [developerId=" + developerId + ", developerName="
				+ developerName + ", developerEmailId=" + developerEmailId + ", developerCompanyName="
				+ developerCompanyName + ", getDeveloperId()=" + getDeveloperId() + ", getDeveloperName()="
				+ getDeveloperName() + ", getDeveloperEmailId()=" + getDeveloperEmailId()
				+ ", getDeveloperCompanyName()=" + getDeveloperCompanyName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
