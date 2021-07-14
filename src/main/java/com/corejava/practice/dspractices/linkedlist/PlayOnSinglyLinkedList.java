package com.corejava.practice.dspractices.linkedlist;

/**
 * 
 * @author abhishek-sriv
 *
 */
public class PlayOnSinglyLinkedList {
	/* */
	public Node head;
	public Node tail;
	public Node prev;
	public int size;
	/**
	 * 
	 * @author abhishek-sriv
	 *
	 */
	 static class Node {
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
	}
	/**
	 * 
	 * @param newNodeData
	 */
	public void push(int newNodeData) {
		/* */
		Node newPushedNode = new Node(newNodeData);
		/* Make next of new Node as head */
		newPushedNode.next = head;
		/* */
		head = newPushedNode;
		/* */
		size++;
	}
	/**
	 * 
	 */
	public void append(int newNodeData) {
		/* */
		Node newAppendNode = new Node(newNodeData);
		/* */
		if(head==null) {
			head = newAppendNode;
			return;
		}
		/* */
		newAppendNode.next = null;
		/* */
		Node tail = head;
		while(tail.next!=null) {
			tail = tail.next;
		}
		tail.next=newAppendNode;

		size++;
	}
	/** 
	 * 
	 * Inserts a new node after the given prevNode. 
	 */
	public void insertAfter(Node prevNode, int newNodeData){
		Node newNode = new Node(newNodeData);
		Node itrNode = head;
		while(itrNode != null) {
			if(itrNode==prevNode) {
				newNode.next = itrNode.next;
				itrNode.next = newNode;
				size++;
				return;
			}
			itrNode = itrNode.next;
		}
	}
	/**
	 * 
	 * Delete a new node
	 * @param key
	 */
	public void deleteNodeForGivenKey(int key){
		if(head.data==key) {
			head = head.next;
			size--;
			return;
		}
		Node itrNode = head;
		while(itrNode != null) {
			if(itrNode.data==key) {
				prev.next = itrNode.next;
				size--;
				return;
			} else {
				prev = itrNode;
			}
			itrNode = itrNode.next;
		}
	}
	/**
	 * 
	 * @param position
	 */
	public void deleteNodeForGivenPosition(int position){
		if(head==null) {
			return;
		}
		Node itrNode = head;
		if(0==position) {
			head = itrNode.next;
			size--;
		}
		for(int i=0; ((size)>i && (itrNode.next!=null)); i++) {
			if(i==position-1) {
				prev.next = itrNode.next;
				size--;
				return;
			} else {
				prev = itrNode;	
			}
			itrNode=itrNode.next;
		}
	}
	/**
	 * 
	 */
	public void deleteList() {
		head=null;
		size=0;
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
	 * @param head
	 * @return
	 */
	Node reverseList(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
	/**
	 * 
	 */
	public void printList() {
		Node itrNode = head;
		while(itrNode != null) {
			System.out.print(itrNode.data+"->"+" ");
			itrNode = itrNode.next;
		}
		if(head!=null) {
			System.out.println("null");
		}else {
			System.out.println("List is not having any Node.");
		}
	}
	/**
	 * 
	 * @param node
	 */
	public void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}
