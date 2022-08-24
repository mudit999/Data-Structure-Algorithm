package stackInJava;

public class StackUsingArrays {
	
	private int[] data;
	private int topIndex;
	
	// own constructor
	// either specify the size of stack
	
	public StackUsingArrays(int size) {
		data = new int[size];
		topIndex = -1;
	}
	
	// stack will handle the size
	public StackUsingArrays() {
		data = new int[3];
		topIndex = -1;
	}
	
	private void doubleCapacity() {
		int[] newArr = new int[2*data.length];
		
		for(int i = 0 ; i<data.length ; i++) {
			newArr[i] = data[i];
		}
		data = newArr;
	}

	//push operation
	// TC - O(1)
	public void push(int item) throws StackFullException{
		
		// if stack is full
		if(topIndex == data.length-1) {
		//	throw new StackFullException();
			System.out.println("Double capacity function");
			doubleCapacity();
		}
	
		topIndex++;
		data[topIndex] = item;
	}
	
	// TC - O(1)
	public int pop() throws StackEmptyException{
		// if stack is empty
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		
		int popElement = data[topIndex];
		topIndex--;
		return popElement;
	}
	
	// TC - O(1)
	public int top() throws StackEmptyException{
		// if stack is empty
		if(topIndex == -1) {
			throw new StackEmptyException();
		}
		return data[topIndex];
	}
	
	
	// TC - O(1)
	public int size() {
		return topIndex+1;
	}
	
	// TC - O(1)
	public boolean isEmpty() {
		return topIndex == -1;
	}
	
	public void printStack() {
		
		for(int i = 0 ;i<=topIndex; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}
