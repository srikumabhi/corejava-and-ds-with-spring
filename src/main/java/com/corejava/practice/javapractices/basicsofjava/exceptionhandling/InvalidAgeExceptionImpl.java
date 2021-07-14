package com.corejava.practice.javapractices.basicsofjava.exceptionhandling;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class InvalidAgeExceptionImpl {

	/**
	 * 
	 * @param age
	 * @throws InvalidAgeExceptionImplOfCustomException
	 */
	public void validate(int voterAge) 
			throws InvalidAgeExceptionImplOfCustomException { 

		final int VOTING_CORRECT_AGE = 18;

		if(voterAge < VOTING_CORRECT_AGE){
			int pendingYears = (VOTING_CORRECT_AGE-voterAge);
			throw new InvalidAgeExceptionImplOfCustomException("Not a valid age "
					+"user(voter). kindly try again after "+pendingYears+" years."); 
		}
		else {  
			System.out.println("Welcome for vote !!"); 
		}
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]){  
		try{  
			InvalidAgeExceptionImpl invalidAgeExceptionImpl = 
					new InvalidAgeExceptionImpl();
			invalidAgeExceptionImpl.validate(10);  
		}catch(Exception ex){
			System.out.println("Exception occured: "+ex);
		}    
	}  
}
