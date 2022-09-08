package hashmap;

import java.util.ArrayList;

public class Map<K,V> {
	ArrayList<MapNode<K,V>> buckets;
	int count;
	int numBuckets;
	
	public Map() {
		
		buckets = new ArrayList<>();
		numBuckets = 5;
		for(int i = 0 ; i<numBuckets; i++) {
			buckets.add(null);
		}
	}
	
	// getIndex
	private int getBucketIndex(K key) {
		int hc = key.hashCode();
		int index = hc%numBuckets;
		return index;
	}
	
	// rehashing
	private void reHash() {
		ArrayList<MapNode<K,V>> temp = buckets;
		
		buckets = new ArrayList<>();
		for(int i = 0 ; i<2*numBuckets; i++) {
			buckets.add(null);
		}
		count = 0;
		numBuckets = 2 * numBuckets;
		
		// traversing all nodes of old ArrayList - temp
		for(int i = 0 ;i<temp.size(); i++) {
			MapNode<K,V> head = temp.get(i);
			
			// traverse LL
			while(head != null) {
				insert(head.key, head.value);
				head = head.next;
			}
			
		}
	}

	// load factor
	public double loadFactor() {
		return (1.0*count)/numBuckets;
	}
	
	// insert
	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		// buckets - name of ArrayList/ reference
		// buckets.get() - will get the reference of MapNode at particular index
		MapNode<K,V> head = buckets.get(bucketIndex);
		
		// checking if key is already present
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			 head = head.next;
		}
		
		// if code comes at this line, means key not found
		// bring back head to original place
		head = buckets.get(bucketIndex);
		
		// create new node
		// newNode.next = head;
		// update the head - > buckets.set(bucketIndex, newNode);
	
		MapNode<K,V> newNode = new MapNode<K,V>(key,value);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		count++;
		
		// load factor
		double loadFactor = (1.0 * count)/numBuckets;
		if(loadFactor > 0.7) {
			reHash();
		}
 	}
	
	
	// getValue
	public V getValue(K Key) {
		int bucketIndex = getBucketIndex(Key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		while(head != null) {
			if(head.key.equals(Key)) {
				return head.value;
			}
			head = head.next;
		}
		
		// if key not found
		return null;

	}
	
	// delete
	public V removeKey(K Key) {
		int bucketIndex = getBucketIndex(Key);
		MapNode<K,V> head = buckets.get(bucketIndex);
		MapNode<K,V> prev = null;
		while(head != null) {
			if(head.key.equals(Key)) {
				V temp = head.value;

				if(prev != null) {
					prev.next = head.next;
				}else {
					buckets.set(bucketIndex, head.next);
				}
				
				count--;
				return temp;
			}
			prev = head;
			head = head.next;
		}
		
		// if key not found
		return null;
	}
	
	public int size() {
		return count;
	}
	
	
}