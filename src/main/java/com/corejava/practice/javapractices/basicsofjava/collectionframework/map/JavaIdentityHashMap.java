package com.corejava.practice.javapractices.basicsofjava.collectionframework.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Map;

import com.corejava.practice.javapractices.basicsofjava.collectionframework.Bike;

/**
 * The difference between HashMap and IdentityHashMap lies in the object equality. 
 * IdentityHashMap actually violates the contract of object equality and it simply 
 * checks whether references are referring to same object.
 * 
 * @author abhishek-sriv
 */
public class JavaIdentityHashMap implements Runnable {

	/**
	 * 
	 */
	public void implementationOfIdentityHashMap() {
		try {
			/* */
			Bike hondaBike1 = new Bike("honda", 250);
			Bike hondaBike2 = new Bike("honda", 250);
			Bike kawasakiBike = new Bike("kawasaki", 650);

			/* */
			Map<Bike, Object> hashMap = new HashMap<Bike, Object>();
			hashMap.put(hondaBike1, "honda");
			hashMap.put(hondaBike2, "honda");
			hashMap.put(kawasakiBike, "kawasaki");
			//hashMap.put(null, null);
			System.out.println("HashMap Size:-"+hashMap.size());

			/* */
			Map<Bike, Object> hashtable = new Hashtable<Bike, Object>();
			hashtable.put(hondaBike1, "honda");
			hashtable.put(hondaBike2, "honda");
			hashtable.put(kawasakiBike, "kawasaki");
			//hashtable.put(null, null);
			System.out.println("Hashtable Size:-"+hashtable.size());

			/* */
			Map<Bike, Object> identityHashMap = new IdentityHashMap<Bike, Object>();
			identityHashMap.put(hondaBike1, "honda");
			identityHashMap.put(hondaBike2, "honda");
			identityHashMap.put(kawasakiBike, "kawasaki");
			//identityHashMap.put(null, null);
			System.out.println("IdentityHashMap:-"+identityHashMap.size());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/*
	 * public Map putTheElementInMap(Bike bike) { return null; }
	 */

	/**
	 * 
	 */
	public void run() {
		implementationOfIdentityHashMap();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JavaIdentityHashMap javaIdentityHashMap = new JavaIdentityHashMap();
		Thread thread1 = new Thread(javaIdentityHashMap);  
		thread1.setName("ImplementationOfIdentityHashMap");
		thread1.start();  
	}
}
