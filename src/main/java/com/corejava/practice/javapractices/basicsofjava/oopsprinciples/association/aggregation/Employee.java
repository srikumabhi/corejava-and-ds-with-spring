package com.corejava.practice.javapractices.basicsofjava.oopsprinciples.association.aggregation;

/**
 * @author abhishek-sriv
 * 
 * In this example, Employee has an object of Address, address object contains its
 * own informations such as city, state, country etc. In such case relationship is 
 * Employee HAS-A address.
 */
public class Employee {

	int employeeId;  
	String employeeName;  
	Address employeeAddress;  

	/**
	 * 
	 * @param employeeId
	 * @param employeeName
	 * @param employeeAddress
	 */
	public Employee(int employeeId, String employeeName, 
			Address employeeAddress) {  
		this.employeeId = employeeId;  
		this.employeeName = employeeName;  
		this.employeeAddress=employeeAddress;  
	}  

	/**
	 * 
	 */
	void display(){  
		System.out.println(employeeId+" "+employeeName);  
		System.out.println(employeeAddress.city+" "+employeeAddress.state+""
				+ " "+employeeAddress.country);  
	}  

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {  

		Address address1 = new Address("Lucknow","UP","india"); 
		Employee employee1 = new Employee(101,"Abhishek Kumar Srivastava",address1); 

		Address address2=new Address("Noida","UP","india");   
		Employee employee2 = new Employee(102,"Rinshu",address2);  

		employee1.display();  
		employee2.display();  

	}  
}
