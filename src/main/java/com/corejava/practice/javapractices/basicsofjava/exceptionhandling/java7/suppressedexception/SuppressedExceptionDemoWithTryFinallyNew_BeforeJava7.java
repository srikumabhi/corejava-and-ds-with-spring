package 
com.corejava.practice.javapractices.basicsofjava.exceptionhandling.java7.suppressedexception;

import static java.lang.System.err;
import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 * 
 * After suppressed exceptions support in Java 7
 *
 */
@Component("suppressedexceptiondemobeforejava7")
public class SuppressedExceptionDemoWithTryFinallyNew_BeforeJava7 {

	/**
	 * Executable member function demonstrating suppressed exceptions
	 * One exception is lost if not added in suppressed exceptions list
	 */
	public void memberFunction() throws Exception
	{
		DirtyResource resource= new DirtyResource();
		try
		{
			resource.accessResource();
		}
		finally
		{
			resource.close();
		}
	}

	/**
	 * 
	 */
	public void SuppressedExceptionDemoWithTryFinallyNew_BeforeJava7Impl() throws Exception {
		try
		{
			new SuppressedExceptionDemoWithTryFinallyNew_BeforeJava7().memberFunction();
		}
		catch(Exception ex)
		{
			err.println("Exception encountered: " + ex.toString());
			final Throwable[] suppressedExceptions = ex.getSuppressed();
			final int numSuppressed = suppressedExceptions.length;
			if (numSuppressed > 0)
			{
				err.println("tThere are " + numSuppressed + " suppressed exceptions:");
				for (final Throwable exception : suppressedExceptions)
				{
					err.println("tt" + exception.toString());
				}
			}
		}
	}

	/**
	 * Local Testing only.
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		SuppressedExceptionDemoWithTryFinallyNew_BeforeJava7 suppressedExceptionDemoWithTryFinallyNew_BeforeJava7
		= new SuppressedExceptionDemoWithTryFinallyNew_BeforeJava7();

		suppressedExceptionDemoWithTryFinallyNew_BeforeJava7.
		SuppressedExceptionDemoWithTryFinallyNew_BeforeJava7Impl();
	}

}
