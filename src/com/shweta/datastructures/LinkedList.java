
package com.shweta.datastructures;

public class LinkedList {

	private Node head = null;
	private int size = 0;

	public void add(String value) {

		Node node = new Node();
		node.value = value;
		if (head == null) {
			head = node;
		} else {
			Node previous = head;
			while (previous.next != null) {
				previous = previous.next;
			}
			previous.next = node;
		}
		size++;
	}

	public String get(int index) {

		// start from beginning of the list
		Node node = head;

		// find the node at the given index
		for (int i = 0; i < index; i++) {
			if (node == null) {
				break;
			}
			node = node.next;
		}

		// return the value of the node
		if (node == null) {
			return null;
		}
		return node.value;
	}

	public String remove(int i) {
		return null;
	}

	public int size() {
		return size;
	}

	private static class Node {
		private String value;
		private Node next;

	}
}
