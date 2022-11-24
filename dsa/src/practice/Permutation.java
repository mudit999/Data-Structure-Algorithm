package practice;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        
        backtracking(nums, result, new ArrayList<>());
        
        return result;
    }
    
    public static void backtracking(int[] nums, List<List<Integer>> result, List<Integer> list){
        // base condition
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
        }else{
            for(int i=0;i<nums.length;i++){
                // no repetition in permutation
                if(list.contains(nums[i])){
                    continue;
                }
                
                list.add(nums[i]);
                backtracking(nums,result,list);
                list.remove(list.size()-1);
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		List<List<Integer>> res = permute(nums);
		System.out.println(res);
		
		List<Integer> tryl = new ArrayList<Integer>();
				tryl.add(10);
				tryl.add(4);
				
				List<Integer> tryltest = new ArrayList<Integer>(tryl);
				System.out.println(tryltest);

	}
}