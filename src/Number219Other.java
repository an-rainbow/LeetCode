import java.util.HashSet;
import java.util.Set;

public class Number219Other {

	// sliding window method. Using a Set to check if any duplicate number in the
	// sliding window.
	// Time: O(n); Space: O(k)

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (nums == null || nums.length == 0) {
			return false;
		}

		Set<Integer> set = new HashSet();
		for (int i = 0; i < nums.length; i++) {
			if (!set.add(nums[i])) {
				return true;
			}

			// update Set of we have more than k numbers
			if (i >= k) {
				set.remove(nums[i - k]);
			}
		}
		return false;
	}

}
