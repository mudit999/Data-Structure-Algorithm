package queueInJava;

import linkedListInJava.Node;

public class QueueUsingLL<T> {
	
	Node<T> front;
	Node<T> rear;
	int size;
	
	public QueueUsingLL() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enqueue(T elem) {
		size++;
		Node<T> newNode = new Node<>(elem);
		// 1 elem in Queue
		if(rear == null || front == null) {
			rear = newNode;
			front = newNode;
//			newNode.next = null;
			return;
		}
		rear.next = newNode;
		rear = newNode; // start pointing to new rear or rear = rear.next
	}
	
	public T front() throws QueueEmptyException {
		// or front is null
		if(size == 0) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	
	public T dequeue() throws QueueEmptyException {
		if(size == 0) {
			throw new QueueEmptyException();
		}
		
		T tempData = front.data;
		// Last elem only in node
		if(front.next == null) {
			front = null;
			rear = null;
		}else {
			front= front.next;
		}
		size--;
		return tempData;
	}
}
