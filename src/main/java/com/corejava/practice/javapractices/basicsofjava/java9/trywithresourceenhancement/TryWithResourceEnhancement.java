package com.corejava.practice.javapractices.basicsofjava.java9.trywithresourceenhancement;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component
public class TryWithResourceEnhancement {

	/**
	 * 
	 * @throws FileNotFoundException
	 */
	public void resourceDeclaredOutsideTheResourceBlock() throws FileNotFoundException{

		FileOutputStream fileOutputStream = new FileOutputStream("POC.txt");  
		try(fileOutputStream){  
			String greeting = "Welcome to corejava-and-ds-with-spring POC";      
			byte b[] = greeting.getBytes();       
			fileOutputStream.write(b);      
			System.out.println("File written");           
		}catch(Exception e) {  
			System.out.println(e);  
		}        
	}

}
