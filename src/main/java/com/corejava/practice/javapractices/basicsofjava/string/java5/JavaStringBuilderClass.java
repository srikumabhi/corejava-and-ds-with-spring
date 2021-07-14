package com.corejava.practice.javapractices.basicsofjava.string.java5;
/**
 * Java StringBuilder class is used to create mutable (modifiable) string. The Java 
 * StringBuilder class is same as StringBuffer class except that it is non-synchronized. 
 * It is available since JDK 1.5
 * StringBuilder is more efficient than StringBuffer.
 *
 * @author abhishek-sriv
 * @see JavaStringBufferClass
 */
public class JavaStringBuilderClass implements Runnable{

	@Override
	public void run() {
		System.out.println("@@@@@@@@@@ InformationAboutCurrentThread @@@@@@@@@@");
		System.out.println("Id:-"+Thread.currentThread().getId());
		System.out.println("Name:-"+Thread.currentThread().getName());
		System.out.println("Priority:-"+Thread.currentThread().getPriority());
		System.out.println("Class:-"+Thread.currentThread().getClass());
		System.out.println("ContextClassLoader:-"+Thread.currentThread().getContextClassLoader());
		System.out.println("StackTrace:-"+Thread.currentThread().getStackTrace());
		System.out.println("State:-"+Thread.currentThread().getState());
		System.out.println("ThreadGroup:-"+Thread.currentThread().getThreadGroup());
		System.out.println("UncaughtExceptionHandler:-"+Thread.currentThread().getUncaughtExceptionHandler());

		javaStringBuilderExamples();
	}

	/**
	 * 
	 */
	public void javaStringBuilderExamples() {
		System.out.println("@@@@@@@@@@ CreateStringBuilder @@@@@@@@@@");
		StringBuilder createStringBuilder=new StringBuilder("Hello ");  
		createStringBuilder.append("Java");//now original string is changed  
		System.out.println(createStringBuilder);//prints Hello Java  

		System.out.println("@@@@@@@@@@ InsertStringBuilder @@@@@@@@@@");
		StringBuilder insertStringBuilder=new StringBuilder("Hello ");  
		insertStringBuilder.insert(1,"Java");//now original string is changed  
		System.out.println(insertStringBuilder);//prints HJavaello  

		System.out.println("@@@@@@@@@@ ReplaceStringBuilder @@@@@@@@@@");
		StringBuilder replaceStringBuilder=new StringBuilder("Hello");  
		replaceStringBuilder.replace(1,3,"Java");  
		System.out.println(replaceStringBuilder);//prints HJavalo  

		System.out.println("@@@@@@@@@@ DeleteStringBuilder @@@@@@@@@@");
		StringBuilder deleteStringBuilder=new StringBuilder("Hello");  
		deleteStringBuilder.delete(1,3);  
		System.out.println(deleteStringBuilder);//prints Hlo  

		System.out.println("@@@@@@@@@@ ReverseStringBuilder @@@@@@@@@@");
		StringBuilder reverseStringBuilder=new StringBuilder("Hello");  
		reverseStringBuilder.reverse();  
		System.out.println(reverseStringBuilder);//prints olleH  

		System.out.println("@@@@@@@@@@ AppendStringBuilder @@@@@@@@@@");
		StringBuilder appendStringBuilder=new StringBuilder();  
		System.out.println(appendStringBuilder.capacity());//default 16  
		appendStringBuilder.append("Hello");  
		System.out.println(appendStringBuilder.capacity());//now 16  
		appendStringBuilder.append("java is my favourite language");  
		System.out.println(appendStringBuilder.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  

		System.out.println("@@@@@@@@@@ EnsureCapacityStringBuilder @@@@@@@@@@");
		StringBuilder ensureCapacityStringBuilder=new StringBuilder();  
		System.out.println(ensureCapacityStringBuilder.capacity());//default 16  
		ensureCapacityStringBuilder.append("Hello");  
		System.out.println(ensureCapacityStringBuilder.capacity());//now 16  
		ensureCapacityStringBuilder.append("java is my favourite language");  
		System.out.println(ensureCapacityStringBuilder.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		ensureCapacityStringBuilder.ensureCapacity(10);//now no change  
		System.out.println(ensureCapacityStringBuilder.capacity());//now 34  
		ensureCapacityStringBuilder.ensureCapacity(50);//now (34*2)+2  
		System.out.println(ensureCapacityStringBuilder.capacity());//now 70 
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new JavaStringBuilderClass());
		thread.setName("JavaStringBuilderClass");
		thread.setPriority(Thread.MAX_PRIORITY);
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.start();
	}

}
