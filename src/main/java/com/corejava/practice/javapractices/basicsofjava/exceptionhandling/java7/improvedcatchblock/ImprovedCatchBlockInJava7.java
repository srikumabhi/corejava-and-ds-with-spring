package 
com.corejava.practice.javapractices.basicsofjava.exceptionhandling.java7.improvedcatchblock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 *
 */
@Component("improvedcatchblockinjava7")
public class ImprovedCatchBlockInJava7 {

	@Autowired
	//private ImprovedCatchBlockInJava7 improvedCatchBlockInJava7;

	/**
	 * 
	 */
	public void catchMultipleExceptionsInSingleCatchBlock() {    
		try {    
			int array[] = new int[10];    
			array[10] = 30/0;    
		}    
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){  
			System.out.println(e.getMessage());  
		}    
	}

	/**
	 * 
	 */
	public void improvedCatchBlockInJava7Impl() {
		catchMultipleExceptionsInSingleCatchBlock();
	}

}
