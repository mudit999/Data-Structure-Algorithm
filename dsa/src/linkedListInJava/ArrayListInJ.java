package linkedListInJava;

import java.util.ArrayList;

public class ArrayListInJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>(20);
		System.out.println(arr.size());
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		
		
		arr.add(1,15);
		arr.remove(2);
		System.out.println(arr);
		System.out.println(arr.size());
		System.out.println(arr.get(2));

	}

}
