package stackInJava;

import java.util.Stack;

public class ReverseStack {

	
	public static void reverseIt(Stack<Integer> stack,Stack<Integer> helper ) {
		
		// base case
		if(stack.size() == 0 || stack.size() == 1) {
			return;
		}
		
		// IS
		int temp = stack.pop();
		// IH
		reverseIt(stack,helper);
		
		// IS
		while(!stack.isEmpty()) {
			helper.push(stack.pop());
		}
		stack.push(temp);
		while(!helper.isEmpty()) {
			stack.push(helper.pop());
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {9,6,5,1,2};
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> helper = new Stack<>();
		
		// filling stack
		for(int item:arr) {
			stack.push(item);
		}
		
		reverseIt(stack,helper);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}