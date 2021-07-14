package com.corejava.practice.javapractices.basicsofjava.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Sometimes in initializer block you may need to write some code, 
 * which can throw checked exceptions. Checked exceptions are those 
 * exceptions which are checked at compile time and compiler force 
 * you to handle them in your code.
 * 
 * @author abhishek-sriv
 */
public class CheckedExceptionsFromConstrctorForInitializerblock {

	/* 
	 * Add throws clause in all constructors for all checked exceptions:- 
	 */
	{
		try{    
			FileInputStream fileInputStream = 
					new FileInputStream("C:\\CheckedExceptionsFromConstrctorForInitializerblock.txt");    

			int byteOfData = fileInputStream.read();  
			System.out.print((char)byteOfData); 

			fileInputStream.close();    
			System.out.println("Task has been completed...");    
		} catch(IOException ex) {  
			System.out.println("Exception=> "+ex);
			throw ex;
		}    
	}
	/*
	 * Add the throws clause in constructors and you will be able to throw 
	 * the checked exceptions from initializers. e.g.
	 */
	public CheckedExceptionsFromConstrctorForInitializerblock() throws Exception{
	}
	public CheckedExceptionsFromConstrctorForInitializerblock(String s) throws Exception{    
	}

	/*  
	 * Static initializers cannot throw checked exceptions:-
	 * If you got static initializers in your class, then you MUST handle 
	 * checked exceptions. You are not allowed to throw them in any possible 
	 * way.
	 */
	static {
		try{ 
			FileOutputStream fout=new FileOutputStream("C:\\CheckedExceptionsFromConstrctorForInitializerblock.txt");    
			String string="Checked exceptions thrown in initializer blocks can be "
					+ "declared by the constructors";  

			/*converting string into byte array */
			byte dataInByte[]= string.getBytes(); 
			fout.write(dataInByte);

			fout.close(); 
		}catch(Exception ex){
			System.out.println("Exception=> "+ex);
			ex.printStackTrace();
			/*
			 * You must handle the exception here...
			 */
			//throw ex;  
		}    
	} 

}
