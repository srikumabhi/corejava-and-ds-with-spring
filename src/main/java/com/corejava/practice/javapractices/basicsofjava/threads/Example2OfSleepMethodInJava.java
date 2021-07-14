package com.corejava.practice.javapractices.basicsofjava.threads;


public class Example2OfSleepMethodInJava implements Runnable{

	public String NOT_A_VALID_AGE = "Not a valid age";

	public String A_VALID_AGE = "A valid age";

	@Override
	public void run() {
		try {
			for(int age=1; age<18; age++) {
				String result = validate(age);
				if(NOT_A_VALID_AGE.equalsIgnoreCase(result)) { 
					Thread.sleep(5000);
					/*
					 * throw new InvalidAgeExceptionImplOfCustomException(
					 * "Not a valid age user(voter)");
					 */
				}
			}
		} catch (InvalidAgeExceptionImplOfCustomException | InterruptedException e) {
			e.printStackTrace();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param age
	 * @throws InvalidAgeExceptionImplOfCustomException
	 */
	public String validate(int voterAge) 
			throws InvalidAgeExceptionImplOfCustomException { 
		System.out.println(Thread.currentThread().getName()); 

		final int VOTING_CORRECT_AGE = 18;

		if(voterAge < VOTING_CORRECT_AGE){
			int pendingYears = (VOTING_CORRECT_AGE-voterAge);
			System.out.println("Not a valid age user(voter). "
					+ "kindly try again after "+pendingYears+" years.");
			/*
			 * throw new InvalidAgeExceptionImplOfCustomException("Not a valid age "
			 * +"user(voter). kindly try again after "+pendingYears+" years.");
			 */
			return NOT_A_VALID_AGE;
		}else { 
			System.out.println("Welcome for vote !!"); 
			return A_VALID_AGE;
		}

	} 

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Example2OfSleepMethodInJava example2OfSleepMethodInJava1 = 
					new Example2OfSleepMethodInJava();
			Thread thread1 = new Thread(example2OfSleepMethodInJava1);
			thread1.setName("1st Thread");
			thread1.setPriority(Thread.MIN_PRIORITY);

			Example2OfSleepMethodInJava example2OfSleepMethodInJava2 = 
					new Example2OfSleepMethodInJava();
			Thread thread2 = new Thread(example2OfSleepMethodInJava2);
			thread2.setName("2nd Thread");
			thread2.setPriority(Thread.MAX_PRIORITY);

			thread1.start();
			thread2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
