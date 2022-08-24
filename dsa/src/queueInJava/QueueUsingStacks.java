package queueInJava;

import java.util.Stack;

public class QueueUsingStacks<T> {
	
	private Stack<T> s1;
	private Stack<T> s2;
	
	public QueueUsingStacks() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}
	
	//size
	public int size() {
		return s1.size();
	}
	
	// isEmpty
	public boolean isEmpty() {
		return s1.size() == 0;
	}
	
	// front
	// enqueue
	// dequeue
	
	public void enqueue(T elem) {
		s1.push(elem);
	}
	
	public T dequeue() throws QueueEmptyException {
		if(s1.isEmpty()) {
			throw new QueueEmptyException();
		}
		int len = s1.size();
		int i = 1;
		while(i <= len-1) {
			s2.push(s1.pop());
			i++;
		}
		T ans = s1.pop();
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
		return ans;
	}
	
	public T front() throws QueueEmptyException {
		if(s1.isEmpty()) {
			throw new QueueEmptyException();
		}
		int len = s1.size();
		int i = 1;
		while(i <= len-1) {
			s2.push(s1.pop());
			i++;
		}
		T ans = s1.peek();
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
		return ans;
	}
}
