package com.corejava.practice.javapractices.basicsofjava.exceptionhandling.java7.suppressedexception;

import static java.lang.System.err;
import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 *
 */
@Component("suppressedexceptiondemoafterjava7")
public class SuppressedExceptionDemoWithTryFinallyPrevious_AfterJava7 {

	/**
	 * Executable member function demonstrating suppressed exceptions
	 * Suppressed expression is added back in primary exception
	 */
	public void memberFunction() throws Exception {
		Throwable th = null;
		DirtyResource resource= new DirtyResource();
		try
		{
			resource.accessResource();
		}
		catch(Exception e)
		{
			th = e;
		}
		finally
		{
			try
			{
				resource.close();
			}
			catch(Exception e)
			{
				if(th != null)
				{
					e.addSuppressed(th); //Add to primary exception
					throw e;
				}
			}
		}
	}

	/**
	 * Local Testing only.
	 * 
	 * Executable function demonstrating suppressed exceptions.
	 * 
	 * @param arguments
	 * @throws Exception
	 */
	public static void main(String[] arguments) throws Exception
	{
		try
		{
			new SuppressedExceptionDemoWithTryFinallyPrevious_AfterJava7().memberFunction();
		}
		catch(Exception ex)
		{
			err.println("Exception encountered: " + ex.toString());
			final Throwable[] suppressedExceptions = ex.getSuppressed();
			final int numSuppressed = suppressedExceptions.length;
			if (numSuppressed > 0)
			{
				err.println("There are " + numSuppressed + " suppressed exceptions:");
				for (final Throwable exception : suppressedExceptions)
				{
					err.println("Suppressed-Exceptions:-" + exception.toString());
				}
			}
		}
	}
}
