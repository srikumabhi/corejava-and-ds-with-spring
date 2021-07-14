package com.corejava.practice.javapractices.basicsofjava.exceptionhandling.java7.trywithresource;

import org.springframework.stereotype.Component;

/**
 * 
 * @author abhishek-sriv
 *
 */
@Component("customresource")
public class CustomResource implements AutoCloseable {

	public void accessResource() {
		System.out.println("Accessing the resource");
	}

	@Override
	public void close() throws Exception {
		System.out.println("CustomResource closed automatically");
	}

	/**
	 * 
	 */
	public void customResourceImpl() {

		try(CustomResource cr = new CustomResource()){
			cr.accessResource();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Local TestForAbstractClass only.
	 * 
	 * @param args
	 */
	public static void main(String[] args) { 
		try(CustomResource cr = new CustomResource()) { 
			cr.accessResource(); 
		} catch (Exception e) {
			e.printStackTrace(); 
		} 
	}
}
