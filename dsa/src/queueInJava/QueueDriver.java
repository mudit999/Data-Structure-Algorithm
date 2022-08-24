package queueInJava;

public class QueueDriver {

	public static void main(String[] args) throws QueueEmptyException {
//		QueueUsingArrays queue = new QueueUsingArrays();
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		
		int arr[] = {5,10,20};
		for(int item : arr) {
			queue.enqueue(item);
		}
		
		System.out.println(queue.size());
		System.out.println(queue.front());
		System.out.println();
//		
//		while(!queue.isEmpty()) {
//			System.out.println(queue.dequeue());
//		}
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.size());
		queue.dequeue();
//		queue.enqueue(33);
//		queue.enqueue(50);

	


//		
//		while(!queue.isEmpty()) {
//		System.out.println(queue.dequeue());
//	}
	}

}
