package com.corejava.practice.dspractices.linkedlist;
/**
 * 
 * @author abhishek-sriv
 *
 */
public class ReverseALinkedList {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	public Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	// prints content of linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	/**
	 * 
	 * @param node
	 * @return
	 */
	public Node reverseLinkedList(Node node) {
		return node;

	}

	// Driver Code
	public static void main(String[] args) {
		ReverseALinkedList list = new ReverseALinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}
