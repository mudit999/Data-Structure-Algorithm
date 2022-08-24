package queueInJava;

public class QueueUsing2StackDriver {

	public static void main(String[] args) throws QueueEmptyException {
		QueueUsingStacks<Integer> q1 = new QueueUsingStacks<>();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(40);
		System.out.println(q1.size());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.front());
		System.out.println(q1.isEmpty());
	}

}
