package com.corejava.practice.javapractices.basicsofjava.string;

/**
 * Java StringBuffer class is used to create mutable (modifiable) string. 
 * The StringBuffer class in java is same as String class except it is mutable 
 * i.e. it can be changed.
 * Java StringBuffer class is thread-safe i.e. multiple threads cannot access 
 * it simultaneously. So it is safe and will result in an order.
 * 
 * @author abhishek-sriv
 * @see JavaStringBuilderClass
 *
 */
public class JavaStringBufferClass implements Runnable {

	@Override
	public void run() {
		JavaStringBufferClass javaStringBufferClass = new JavaStringBufferClass();
		javaStringBufferClass.stringBufferExample();
	}

	/**
	 * 
	 */
	public void stringBufferExample() {
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

		System.out.println("@@@@@@@@@@ CreateStringBuffer @@@@@@@@@@");
		StringBuffer createStringBuffer=new StringBuffer("Hello ");  
		createStringBuffer.append("Java");//now original string is changed  
		System.out.println(createStringBuffer);//prints Hello Java  

		System.out.println("@@@@@@@@@@ InsertStringBuffer @@@@@@@@@@");
		StringBuffer insertStringBuffer=new StringBuffer("Hello ");  
		insertStringBuffer.insert(1,"Java");//now original string is changed  
		System.out.println(insertStringBuffer);//prints HJavaello  

		System.out.println("@@@@@@@@@@ ReplaceStringBuffer @@@@@@@@@@");
		StringBuffer replaceStringBuffer=new StringBuffer("Hello");  
		replaceStringBuffer.replace(1,3,"Java");  
		System.out.println(replaceStringBuffer);//prints HJavalo  

		System.out.println("@@@@@@@@@@ DeleteStringBuffer @@@@@@@@@@");
		StringBuffer deleteStringBuffer=new StringBuffer("Hello");  
		deleteStringBuffer.delete(1,3);  
		System.out.println(deleteStringBuffer);//prints Hlo  

		System.out.println("@@@@@@@@@@ ReverseStringBuffer @@@@@@@@@@");
		StringBuffer reverseStringBuffer=new StringBuffer("Hello");  
		reverseStringBuffer.reverse();  
		System.out.println(reverseStringBuffer);//prints olleH  

		System.out.println("@@@@@@@@@@ AppendStringBuffer @@@@@@@@@@");
		StringBuffer appendStringBuffer=new StringBuffer();  
		System.out.println(appendStringBuffer.capacity());//default 16  
		appendStringBuffer.append("Hello");  
		System.out.println(appendStringBuffer.capacity());//now 16  
		appendStringBuffer.append("java is my favourite language");  
		System.out.println(appendStringBuffer.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  

		System.out.println("@@@@@@@@@@ EnsureCapacityStringBuffer @@@@@@@@@@");
		StringBuffer ensureCapacityStringBuffer=new StringBuffer();  
		System.out.println(ensureCapacityStringBuffer.capacity());//default 16  
		ensureCapacityStringBuffer.append("Hello");  
		System.out.println(ensureCapacityStringBuffer.capacity());//now 16  
		ensureCapacityStringBuffer.append("java is my favourite language");  
		System.out.println(ensureCapacityStringBuffer.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		ensureCapacityStringBuffer.ensureCapacity(10);//now no change  
		System.out.println(ensureCapacityStringBuffer.capacity());//now 34  
		ensureCapacityStringBuffer.ensureCapacity(50);//now (34*2)+2  
		System.out.println(ensureCapacityStringBuffer.capacity());//now 70  
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new JavaStringBufferClass());

		thread.setName("JavaStringBufferClass");
		thread.setPriority(Thread.MAX_PRIORITY);
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.start();
	}
}
