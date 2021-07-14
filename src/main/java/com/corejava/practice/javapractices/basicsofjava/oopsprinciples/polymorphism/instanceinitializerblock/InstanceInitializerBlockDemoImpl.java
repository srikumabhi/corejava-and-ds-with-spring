package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.polymorphism.instanceinitializerblock;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class InstanceInitializerBlockDemoImpl extends InstanceInitializerBlockDemo {

	private int developerId;
	private String developerName ;
	private String developerEmailId;

	InstanceInitializerBlockDemoImpl() throws Exception {
		System.out.println("In no-argument constructor");
	}

	InstanceInitializerBlockDemoImpl(int testDeveloperId) throws Exception {
		System.out.println("In one-argument constructor!");
	}

	InstanceInitializerBlockDemoImpl(String testDeveloperName, 
			String testDeveloperEmailId) throws Exception {
		System.out.println("In two-argument constructor!!");
	}

	InstanceInitializerBlockDemoImpl(int testDeveloperId, String testDeveloperName, 
			String testDeveloperEmailId) throws Exception {
		System.out.println("In three-argument constructor!!!");
	}

	/* First instance initialization block  */
	{
		developerId = 101;
		System.out.println("In first instance init block, DeveloperId => " 
				+ this.developerId);
	}

	/* Second instance initialization block */
	{
		developerName="Abhishek Kumar Srivastava";
		System.out.println("In second instance init block, DeveloperName => " 
				+ this.developerName);
	}

	/* Third instance initialization block */
	{
		developerEmailId="srivastava.abhi@outlook.com";
		System.out.println("In third instance init block, DeveloperEmailId => " 
				+ this.developerEmailId);
	}

	/* First static initialization block */
	static {
		InstanceInitializerBlockDemoImpl.developerWorkShop="KahiNahi";
		System.out.println("In first static block.");
	}

	/* Second static initialization block  */
	static {
		System.out.println("dveloperWorkShop=>"+InstanceInitializerBlockDemoImpl.
				developerWorkShop);
		System.out.println("In second static block..");
	}

	/* Third static initialization block  */
	static {
		System.out.println("In third static block...");
	}

	/**
	 * 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String args[]) throws Exception {
		new InstanceInitializerBlockDemoImpl();
		new InstanceInitializerBlockDemoImpl(101);
		new InstanceInitializerBlockDemoImpl("Rinshu","srikumabhi@outlook.com");
		new InstanceInitializerBlockDemoImpl(101,"Rinshu","srikumabhi@outlook.com");
	}
}
