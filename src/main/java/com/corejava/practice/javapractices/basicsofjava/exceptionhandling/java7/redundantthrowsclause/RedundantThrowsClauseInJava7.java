package 
com.corejava.practice.javapractices.basicsofjava.exceptionhandling.java7.redundantthrowsclause;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class RedundantThrowsClauseInJava7 {

	/**
	 * 
	 */
	public void redundantThrowsClause()
	//throws Throwable  //No need to do this
	{
		try {
			//Do some processing which throws NullPointerException; I am sending directly
			throw new NullPointerException();
		}
		//You can catch multiple exception added after 'pipe' character
		catch(NullPointerException | IndexOutOfBoundsException ex)
		{
			throw ex;
		}
		//Now method sampleMethod() do not need to have 'throws' clause
		/*
		 * catch(Throwable ex) { throw ex; }
		 */
	}

}
