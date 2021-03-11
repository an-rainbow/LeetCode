import java.util.HashMap;
import java.util.Map;



public class Number217 {
	public boolean containsDuplicate(int[] nums) {

		if (nums == null || nums.length == 1)
			return false;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return true;
			} else {
				map.put(nums[i],1);
			}
		}
        return false;
		
	}

	public static void main(String[] args) {
		Number217 test = new Number217();
		int[] nums = { 1, 2, 3, 1};
		test.containsDuplicate(nums);
		System.out.println(test.containsDuplicate(nums));

	}

}
