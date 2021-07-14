package com.corejava.practice.dspractices.linkedlist;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class SinglyLinkedListImplExample2 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		PlayOnSinglyLinkedList playOnSinglyLinkedList = 
				new PlayOnSinglyLinkedList();
		/* */
		playOnSinglyLinkedList.push(100);
		playOnSinglyLinkedList.push(102);
		playOnSinglyLinkedList.push(104);
		playOnSinglyLinkedList.push(106);
		System.out.println("Size-> "+playOnSinglyLinkedList.getListSize());
		playOnSinglyLinkedList.printList();
		/* */
		playOnSinglyLinkedList.append(98);
		playOnSinglyLinkedList.append(108);
		System.out.println("Size-> "+playOnSinglyLinkedList.getListSize());
		playOnSinglyLinkedList.printList();
		/* */
		playOnSinglyLinkedList.insertAfter(playOnSinglyLinkedList.head.next, 
				101);
		System.out.println("Size-> "+playOnSinglyLinkedList.getListSize());
		playOnSinglyLinkedList.printList();
		/* */
		//playOnSinglyLinkedList.deleteNodeForGivenKey(106);
		//System.out.println("Size-> "+playOnSinglyLinkedList.getListSize());
		//playOnSinglyLinkedList.printList();
		/* */
		//playOnSinglyLinkedList.deleteNodeForGivenPosition(3);
		//System.out.println("Size-> "+playOnSinglyLinkedList.getListSize());
		//playOnSinglyLinkedList.printList();
		/* */
		//playOnSinglyLinkedList.deleteNodeForGivenPosition(0);
		//System.out.println("Size-> "+playOnSinglyLinkedList.getListSize());
		//playOnSinglyLinkedList.printList();
		/* */
		//playOnSinglyLinkedList.deleteNodeForGivenKey(102);
		//System.out.println("Size-> "+playOnSinglyLinkedList.getListSize());
		//playOnSinglyLinkedList.printList();
		/* */
		//playOnSinglyLinkedList.deleteNodeForGivenKey(1021);
		//System.out.println("Size-> "+playOnSinglyLinkedList.getListSize());
		//playOnSinglyLinkedList.printList();
		/* */
		//playOnSinglyLinkedList.deleteList();
		//System.out.println("Size-> "+playOnSinglyLinkedList.getListSize());
		//playOnSinglyLinkedList.printList();
	}
}
