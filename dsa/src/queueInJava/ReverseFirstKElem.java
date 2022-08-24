package queueInJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElem {
	
	public static void reverseFirstKElem(Queue<Integer> queue, int k) {
		Stack<Integer> s1 = new Stack<>();
		Queue<Integer> q1 = new LinkedList<>();

		// first k elem dequeue from queue and pushed in s1 stack
		for(int i = 1; i<=k; i++) {
			s1.push(queue.poll());
		}

		// rest of elem dequeue from queue and enqueue in q1 queue
		while(!queue.isEmpty()) {
			q1.add(queue.poll());
		}
		
		// put all s1 elem into queue
		while(!s1.isEmpty()) {
			int data = s1.peek();
			queue.add(data);
			s1.pop();
		}
		
		 //put q1 elem back into queue
		while(!q1.isEmpty()) {
			queue.add(q1.poll());
		}
	}
	
	public static void reverseFirstKElemBetter(Queue<Integer> queue, int k) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i<k; i++) {
			stack.add(queue.poll());
		}
		
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		
		for(int j = 0; j<queue.size() - k; j++) {
			queue.add(queue.poll());
		}
	}
	
	public static void printQueue(Queue<Integer> queue) {
		Queue<Integer> temp = queue;
		while(!temp.isEmpty()) {
			System.out.print(temp.poll() + " ");
		}
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		int arr[] = {10,20,30,40,50,60,70,80,90};
		int i = 0;
		while(i < arr.length) {
			queue.add(arr[i]);
			i++;
		}

//		printQueue(queue);        // it was killing my code because queue was getting empty and then passed in reverseFirstKElem function
		reverseFirstKElem(queue,4);
		printQueue(queue);
	}
}