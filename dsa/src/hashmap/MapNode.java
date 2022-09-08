package hashmap;

public class MapNode<K,V> {
	K key;
	V value;
	// link to next node
	MapNode<K,V> next;
	
	public MapNode(	K key, V value) {
		this.key = key;
		this.value = value;
	}
}