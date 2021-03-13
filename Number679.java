import java.util.HashMap;
import java.util.Map;

public class Number679 {
	public int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> num_counts=new HashMap();
		Map<Integer, Integer> first_seen=new HashMap();
		int degree=0;
		int min_length=0;
		for (int i=0; i<nums.length; i++) {
			first_seen.putIfAbsent(nums[i],i);
			num_counts.put(nums[i], num_counts.getOrDefault(nums[i],0)+1);
			if(num_counts.get(nums[i])>degree) {
				degree=num_counts.get(nums[i]);
				min_length=i-first_seen.get(nums[i])+1;
			}else if(num_counts.get(nums[i])==degree) {
				min_length=Math.min(min_length, i-first_seen.get(nums[i])+1);
			}
		}
		return min_length;
	}

}
