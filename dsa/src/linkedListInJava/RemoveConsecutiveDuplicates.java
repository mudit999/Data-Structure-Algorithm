package linkedListInJava;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {

	public static ArrayList<Integer> removeIt(ArrayList<Integer> arr){
		int i = 0;
		while(i<arr.size()-1) {
			if(arr.get(i) == arr.get(i+1)) {
				arr.remove(+1);
			}else {
				i++;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(10);
		arr.add(20);
		arr.add(20);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(10);
		System.out.println(arr);
		System.out.println(removeIt(arr));

	}

}
