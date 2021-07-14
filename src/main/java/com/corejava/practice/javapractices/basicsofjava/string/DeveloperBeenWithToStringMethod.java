package com.corejava.practice.javapractices.basicsofjava.string;

/**
 * If you want to represent any object as a string, toString() method comes into 
 * existence.
 * The toString() method returns the string representation of the object.
 * If you print any object, java compiler internally invokes the toString() method 
 * on the object. So overriding the toString() method, returns the desired output, 
 * it can be the state of an object etc. depends on your implementation.
 * 
 * @author abhishek-sriv
 * @see DeveloperBeenUnderstandingProblemWithoutToStringMethod
 */
public class DeveloperBeenWithToStringMethod {

	int developerId;  
	String developerName;  
	String developerWorkLocation;  

	/**
	 * 
	 * @param developerId
	 * @param developerName
	 * @param developerWorkLocation
	 */
	public DeveloperBeenWithToStringMethod(int developerId, String developerName, 
			String developerWorkLocation){  
		this.developerId = developerId;  
		this.developerName = developerName;  
		this.developerWorkLocation = developerWorkLocation;  
	}

	/**
	 * By overriding the toString() method of the Object class, we can return 
	 * values of the object, so we don't need to write much code.
	 */
	@Override
	public String toString() {
		return "DeveloperBeenWithToStringMethod [developerId=" + developerId + ", developerName="
				+ developerName + ", developerWorkLocation=" + developerWorkLocation + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread() {  
			public void run() {
				synchronized(this) {
					DeveloperBeenWithToStringMethod developerBeen = 
							new DeveloperBeenWithToStringMethod(
									101,"Abhishek Kumar Srivastava","Noida");
					System.out.println(developerBeen);
				}
			}  
		};
		thread1.start();
	}
}
