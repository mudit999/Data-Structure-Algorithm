package queueInJava;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues<T> {
	 private Queue<T> q1;
	 private Queue<T> q2;
	 
	 public StackUsingQueues() {
		 q1 = new LinkedList<>();
		 q2 = new LinkedList<>();
	 }
	 
	 public int size() {
		 return q1.size();
	 }
	 
	 public boolean isEmpty() {
		 return q1.size() == 0;
	 }
	 
	 // push , pop, top
	 public void push(T elem) {
		 q1.add(elem);
	 }
	 
	 public T pop() {
		 while(q1.size() > 1) {
			 q2.add(q1.poll());
		 }
		 T ans = q2.poll();
		 
		 while(!q2.isEmpty()) {
			 q1.add(q2.poll());
		 }
		 return ans;
	 }
	 
	 public T top() {
		 while(q1.size() > 1) {
			 q2.add(q1.poll());
		 }
		 T ans = q2.peek();
		 
		 while(!q2.isEmpty()) {
			 q1.add(q2.poll());
		 }
		 return ans;
	 }
}
