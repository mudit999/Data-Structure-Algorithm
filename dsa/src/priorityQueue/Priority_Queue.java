package priorityQueue;

import java.util.ArrayList;

//MIN HEAP

public class Priority_Queue<T> {
	// PQ will maintain a heap and we are storing heap in ArrayList
	private ArrayList<Element<T>> heap;
	 
	public Priority_Queue() {
		// currently empty 
		heap = new ArrayList<>(); 
	}
	
	// insert
	public void insert(T value, int priority) {
		Element<T> e = new Element<T>(value, priority);
		// index at last index
		heap.add(e);
		
		int childIndex = heap.size()-1;
		int parentIndex = (childIndex - 1)/2;
		
		while(childIndex > 0) {
			// compare priority - MIN heap
			if(heap.get(childIndex).priority < heap.get(parentIndex).priority) {
				 // swap Elements
				Element<T> temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1)/2;
			}else {
				// heap Order property meets -> stop there
				return;
			}
		}
	}
	
	// getMin
	public T getMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		return heap.get(0).value;
	}
	
	// remove Elem with min priority 
	public T removeMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		// get min
		Element<T> removed = heap.get(0);
		T ans = removed.value;
		
		// get the last elem and move it on 0 index		
		Element<T> lastElem = heap.get(size()-1);
		heap.set(0, lastElem);
		// remove last elem
		heap.remove(size()-1);
		
		// DOWN HEAPIFY
		int parentIndex = 0;
		int leftChildIndex = (2 * parentIndex)+1;
		int rightChildIndex = (2 * parentIndex)+2;

		while(leftChildIndex < size()) {
			
			// get Min of three -> parentIndex, leftChildIndex, rightChildIndex
			int minIndex = parentIndex;

			if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
				minIndex = leftChildIndex;
			}
			
			if(rightChildIndex < heap.size() && (heap.get(rightChildIndex).priority < heap.get(minIndex).priority)) {
				minIndex = rightChildIndex;
			}
			
			// edge case
			if(minIndex == parentIndex) {
				// no need of swapping
				break;
			}
					
			// swap them 
			Element<T> temp = heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex,temp);
			
			// update parentIndex
			parentIndex = minIndex;
			// cal rest
			leftChildIndex = (2 * parentIndex)+1;
			rightChildIndex = (2 * parentIndex)+2;			
		}
		
		// return min Elem value
		return ans;
	}
	
	// size
	public int size() {
		return heap.size();
	}
	
	// isEmpty
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		return false;
	}
	
}
