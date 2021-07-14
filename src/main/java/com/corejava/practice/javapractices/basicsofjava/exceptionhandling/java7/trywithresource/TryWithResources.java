package 
com.corejava.practice.javapractices.basicsofjava.exceptionhandling.java7.trywithresource;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator
 *
 */
@Component("trywithresources")
public class TryWithResources {

	/**
	 * The old way of resource cleanup (Before java 7).
	 */
	public void resourceManagementBeforeJava7() {

		BufferedReader br = null;
		try
		{
			String sCurrentLine;
			br = new BufferedReader(new FileReader("C:/abhishek/workspaces-java-practices/corejava-and-ds-with-spring/"
					+ "src/main/resources/documentation/Java-7-Try-With-Resources.text"));
			while ((sCurrentLine = br.readLine()) != null) 
			{
				System.out.println(sCurrentLine);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (br != null)
					br.close();
			} 
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

	/**
	 * The new fancy way with try-with-resources (syntax example).
	 */
	public void resourceManagementInJava7(){

		//String filePath="documentation\TestForAbstractClass.json";
		//final File file = new File(getClass().getClassLoader().getResource(filePath).getFile());
		
		try ( BufferedReader br = new BufferedReader(new FileReader
				("C:/abhishek/workspaces-java-practices/corejava-and-ds-with-spring/src/main/resources/documentation/"
						+ "Java-7-Try-With-Resources.text")) ){
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * The new fancy way with try-with-resources (Using multiple resources).
	 */
	public void tryWithResourcesUsingMultipleResources(){        

		// Using try-with-resources  
		try(    // Using multiple resources  
				FileOutputStream fileOutputStream =new FileOutputStream("C:/abhishek/workspaces-java-practices/"
						+ "corejava-and-ds-with-spring/src/main/resources/documentation/Java-7-Try-With-Resources.text");  
				InputStream input = new FileInputStream("C:/abhishek/workspaces-java-practices/"
						+ "corejava-and-ds-with-spring/src/main/resources/documentation/Java-7-Try-With-Resources.text")){  
			// -----------------------------Code to write data into file--------------------------------------------//  
			String msg = "In Java7, the try-with-resources statement is a try statement that declares one or more resources. "
					+ "The resource is as an object that must be closed after finishing the program. "
					+ "The try-with-resources statement ensures that each resource is closed at the end of the statement execution.";      
			byte byteArray[] = msg.getBytes();  // Converting string into byte array      
			fileOutputStream.write(byteArray);  // Writing  data into file  
			System.out.println("------------Data written into file--------------");  
			System.out.println(msg);  
			// -----------------------------Code to read data from file---------------------------------------------//  
			// Creating input stream instance  
			DataInputStream inst = new DataInputStream(input);    
			int data = input.available();    
			// Returns an estimate of the number of bytes that can be read from this input stream.   
			byte[] byteArray2 = new byte[data]; //    
			inst.read(byteArray2);    
			String str = new String(byteArray2); // passing byte array into String constructor  
			System.out.println("------------Data read from file--------------");  
			System.out.println(str); // display file data  
		}catch(Exception exception){  
			System.out.println(exception);  
		}     
	}  

	/**
	 * 
	 */
	public void tryWithResourcesImpl(){
		/**
		 * 
		 */
		resourceManagementBeforeJava7();

		/**
		 * 
		 */
		resourceManagementInJava7();

		/**
		 * 
		 */
		tryWithResourcesUsingMultipleResources();
	}

}

