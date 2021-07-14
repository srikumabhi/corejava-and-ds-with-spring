package com.corejava.practice.javapractices.basicsofjava.collectionframework.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class JavaListIteratorInterface {

	/**
	 * 
	 */
	public void listIteratorExample1(){

		List<String> list = new ArrayList<String>();  

		list.add("Abhishek");    
		list.add("Srivastava");    
		list.add("Rinshu");    
		list.add(1,"Kumar");  

		ListIterator<String> listIterator = list.listIterator();    
		System.out.println("Traversing elements in forward direction");    
		while(listIterator.hasNext()){    
			System.out.println("index:"+listIterator.nextIndex()+" value:"+
					listIterator.next());    
		}    
		System.out.println("Traversing elements in backward direction");    
		while(listIterator.hasPrevious()){    
			System.out.println("index:"+listIterator.previousIndex()+" value:"+
					listIterator.previous());    
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		Thread thread1 = new Thread(){
			public void run() {
				new JavaListIteratorInterface().listIteratorExample1();
			}
		};
		thread1.start();
	}
}
