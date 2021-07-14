package com.corejava.practice.dspractices.linkedlist;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class EmployeeLinkedList {
	/**
	 * 
	 */
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	/**
	 * 
	 * @param employee
	 */
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	/**
	 * 
	 * @return
	 */
	public int getListSize() {
		return size;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isListEmpty() {
		return head == null;
	}
	/**
	 * 
	 * @return
	 */
	public EmployeeNode removeFromFront() {
		if(isListEmpty()) {
			return null;
		}
		EmployeeNode removeNode = head;
		head = head.getNext();
		size--;
		removeNode.setNext(null); 
		return removeNode;
	}
	/**
	 * 
	 * @param employee
	 */
	public void addToEnd(Employee employee) {
	
	}
	/**
	 * 
	 */
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD ->");
		while(current!=null) {
			System.out.print(current);
			System.out.print("->");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
