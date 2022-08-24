package stackInJava;

import java.util.Stack;

public class StackDriver {

	public static void main(String[] args) throws StackFullException, StackEmptyException{
//		 StackUsingArrays stack = new StackUsingArrays();
//			stack.push(10);
//			stack.push(20);
//			System.out.println(stack);
//			stack.push(30);
//			stack.push(40);
//			System.out.println(stack.pop());
//			System.out.println(stack.size());
//			System.out.println(stack.isEmpty());
//			stack.printStack();
//			System.out.println(stack);
		
//		StackUsingLL<Integer> stack = new StackUsingLL<>();
//		int[] arr = {3,4,5,6,9};
//		
//		for(int i = 0; i<arr.length;i++) {
//			stack.push(arr[i]);
//		}
//		
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
//		
//		System.out.println(stack.top());
		
		
		// stack using collection
		Stack<Integer> stackCollection = new Stack<Integer>();
		stackCollection.push(10);
		stackCollection.push(20);
		System.out.println(stackCollection.peek());
		System.out.println(stackCollection.size());
		System.out.println(stackCollection.pop());
		System.out.println(stackCollection.pop());
		System.out.println(stackCollection.isEmpty());

	}

}