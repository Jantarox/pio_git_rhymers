package edu.kis.vh.nursery.list;

//TODO: usunąć klasę IntLinkedList, pod warunkiem, że nie będzie ona dalej używana
public class IntLinkedList {

	private static final int EMPTY_STACK_VALUE = -1;

	private class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			setValue(i);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	private Node last;

	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
