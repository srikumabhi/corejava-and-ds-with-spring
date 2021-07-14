package com.corejava.practice.dspractices.linkedlist;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class SinglyLinkedListImplExample1 { 
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee janeDoe = new Employee("Jane", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike","Wilson", 3245);
		Employee billHuff = new Employee("Bill","Huff", 3245);
		/**
		 * 
		 */
		EmployeeLinkedList list = new EmployeeLinkedList();

		System.out.println("Before adding any element->"+list.isListEmpty());
		list.addToFront(janeJones);
		list.addToFront(janeDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		System.out.println("After adding some element->"+list.isListEmpty());
		//
		list.printList();
		System.out.println("Size of SinglyLinkedList after adding some "
				+ "element-> "+list.getListSize());
		/**
		 * 
		 */
		System.out.println(list.isListEmpty());
		list.addToEnd(billHuff);
		list.printList();
		System.out.println(list.getListSize());
		/**
		 * 
		 */
		System.out.println(list.isListEmpty());
		list.removeFromFront();
		list.printList();
		System.out.println("Size of SinglyLinkedList after removing head "
				+ "element-> "+list.getListSize());
	}
}
