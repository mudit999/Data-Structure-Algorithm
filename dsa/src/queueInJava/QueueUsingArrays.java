package queueInJava;

public class QueueUsingArrays {
	int front;
	int rear;
	int[] data;
	int size;
	
	// constructor
	public QueueUsingArrays() {
		front = -1;
		rear = -1;
		data = new int[3];
		size = 0;
	}
	
	public void doubleCapacity() {
		int[] newArr = new int[2*data.length];
		int index = 0;
		
		// copy from front to data.length-1
		for(int i = front; i<data.length; i++) {
			newArr[index] = data[i];
			index++;
		}
		
		// copy from 0 to rear/front-1
		for(int i = 0; i<front-1;i++) {
			newArr[index] = data[i];
			index++;
		}
		front = 0;
		rear = data.length-1;
		
		data = newArr;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int front() throws QueueEmptyException {
		// size == 0 or front == -1
		if(front == -1) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public int dequeue() throws QueueEmptyException{
		if(front == -1) {
			throw new QueueEmptyException();
		}
		int dequeueElemData = data[front];
//		front++;
//		if(front == data.length) {
//			front = 0;
//		}
		front = (front+1)%data.length;
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return dequeueElemData;
	}
	
	public void enqueue(int elem){
		// or size == data.length
		if(size == data.length) {
//			throw new QueueFullException();
			doubleCapacity();
		}
		
		// enqueue first elem in queue
		if(front == -1) {
			front++;
		}
		
//		rear++;
//		// circular queue
//		if(rear == data.length) {
//			rear = 0;
//		}
		rear = (rear+1)%data.length;
		data[rear] = elem;
		size++;
	}
}
