package priorityQueue;

public class Priority_QueueUse {
	public static void main(String[] args) throws PriorityQueueException {
		
		// Min Prioirty Queue
//		Priority_Queue<String> pq = new Priority_Queue<>();
		
		// Max Priority Queue
		Priority_QueueMaxHeap<String> pq = new Priority_QueueMaxHeap<>();
		pq.insert("abc", 30);
		pq.insert("def", 40);
		pq.insert("tf", 10);
		pq.insert("ds", 60);
		pq.insert("fgc", 30);
		pq.insert("wc", 80);
		
		while(!pq.isEmpty()) {
			// Min Prioirty Queue
//			System.out.println(pq.getMin());
//			pq.removeMin();
			
			// Max Priority Queue
			System.out.println(pq.getMax());
			pq.removeMax();
		}

	}
}
