package linkedListInJava;

import java.util.LinkedList;

public class LLCollectionFramework {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.addFirst(99);
		ll.set(0, 98);
		ll.remove();
		
		for(int i = 0; i<ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		System.out.println(ll.get(0));
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
	}

}
