package com.corejava.practice.javapractices.basicsofjava.exceptionhandling;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class CustomExceptionsByStaticNestedClasses extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomExceptionsByStaticNestedClasses(String msg) {
		super(msg);
	}

	//SQL execution error
	public static class BadExecution extends BaseException
	{
		private static final long serialVersionUID = 3555714415375055302L;
		public BadExecution(String msg) {
			super(msg);
		}
	}

	//No data exist where we expect at least one row
	public static class NoData extends BaseException
	{
		private static final long serialVersionUID = 8777415230393628334L;
		public NoData(String msg) {
			super(msg);
		}
	}

	//Multiple rows exist where we expect only single row
	public static class MoreData extends BaseException
	{
		private static final long serialVersionUID = -3987707665150073980L;
		public MoreData(String msg) {
			super(msg);
		}
	}

	//Invalid parameters error
	public static class InvalidParam extends BaseException
	{
		private static final long serialVersionUID = 4235225697094262603L;
		public InvalidParam(String msg) {
			super(msg);
		}
	}
}
