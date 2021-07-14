package com.corejava.practice.javapractices.basicsofjava.string;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class DeveloperBeenUnderstandingProblemWithoutToStringMethod {

	int developerId;  
	String developerName;  
	String developerWorkLocation;  

	/**
	 * 
	 * @param developerId
	 * @param developerName
	 * @param developerWorkLocation
	 */
	public DeveloperBeenUnderstandingProblemWithoutToStringMethod(int developerId, 
			String developerName, String developerWorkLocation){  
		this.developerId = developerId;  
		this.developerName = developerName;  
		this.developerWorkLocation = developerWorkLocation;  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread() {  
			public void run() {
				synchronized(this) {
					DeveloperBeenUnderstandingProblemWithoutToStringMethod developerBeen = 
							new DeveloperBeenUnderstandingProblemWithoutToStringMethod(
									101,"Abhishek Kumar Srivastava","Noida");
					System.out.println(developerBeen);
				}
			}  
		};
		thread1.start();
	}
}
