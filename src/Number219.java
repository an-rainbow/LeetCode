import java.util.HashMap;
import java.util.Map;

//Time: O(n); Space: O(n)

public class Number219 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if(nums==null || nums.length==0) 
			return false;
		
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer j = map.get(nums[i]);
			if (j != null && i-j <= k) {
				return true;
			}
			map.put(nums[i], i);

		}
		return false;
	}

}
