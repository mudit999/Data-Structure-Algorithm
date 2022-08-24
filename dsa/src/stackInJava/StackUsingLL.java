package stackInJava;

import linkedListInJava.Node;

public class StackUsingLL<T> {
	private Node<T> head;
	private int size;
	
	// own constructor
	public StackUsingLL() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public void push(T elem) {
		Node<T> newNode = new Node<T>(elem);
		newNode.next = head;
		head = newNode;
		size++;
	}
	
	public T top() throws StackEmptyException{
		
		// if stack is empty
		if(head == null || size == 0) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	public T pop() throws StackEmptyException{
		if(head == null || size == 0) {
			throw new StackEmptyException();
		}
		size--;
		T tempData = head.data;
		head = head.next;
		return tempData;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}