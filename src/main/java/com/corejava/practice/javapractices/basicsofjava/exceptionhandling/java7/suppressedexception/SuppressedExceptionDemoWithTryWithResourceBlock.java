package 
com.corejava.practice.javapractices.basicsofjava.exceptionhandling.java7.suppressedexception;

import static java.lang.System.err;

import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 *
 */
@Component("suppressedexceptiondemowith_trywithresource")
public class SuppressedExceptionDemoWithTryWithResourceBlock {

	public void memberFunction() throws Exception
	{
		try (DirtyResource resource= new DirtyResource())
		{
			resource.accessResource();
		}
	}

	/**
	 * Local Testing only.
	 * 
	 * Executable member function demonstrating suppressed exceptions 
	 * using try-with-resources.
	 */
	public void suppressedExceptionDemoWithTryWithResourceBlockImpl() throws Exception {
		try {
			new SuppressedExceptionDemoWithTryWithResourceBlock().memberFunction();
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

	/**
	 * 
	 * Executable member function demonstrating suppressed exceptions using default try-with-resource block.
	 */
	public void defaultTryWithResourceBlock() throws Exception {
		try (DirtyResource resource = new DirtyResource())
		{
			resource.accessResource();
		}
	}

	/**
	 * Local Testing only.
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		SuppressedExceptionDemoWithTryWithResourceBlock suppressedExceptionDemoWithTryWithResourceBlock = 
				new SuppressedExceptionDemoWithTryWithResourceBlock();
		/**
		 * 
		 */
		suppressedExceptionDemoWithTryWithResourceBlock.suppressedExceptionDemoWithTryWithResourceBlockImpl();

		/**
		 * 
		 */
		//System.out.println("### Suppressed-Exception demo with default try-with-resource block ###");
		suppressedExceptionDemoWithTryWithResourceBlock.defaultTryWithResourceBlock();

	}

}
