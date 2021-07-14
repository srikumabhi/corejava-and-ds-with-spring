package com.corejava.practice.dspractices.linkedlist;

public class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;
	
	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}
	
	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @return the next
	 */
	public EmployeeNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return employee.toString();
	}
	
}
