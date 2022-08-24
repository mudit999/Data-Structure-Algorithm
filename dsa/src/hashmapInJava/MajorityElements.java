package hashmapInJava;
import java.util.*;

public class MajorityElements {

	
	public static void majorityEle(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0 ; i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = {2,2,1,1,1,2,2};
//		int ans = majorityEle(arr);
//		System.out.println(ans);
		System.out.println("hELLP");
	}

}
