import java.util.HashMap;
import java.util.Map;

public class Number645 {
	public int[] findErrorNums(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] arr = new int[2];
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		int dup = -1;
		int missing = 1;
		for (int i = 1; i <= nums.length; i++) {
			if (map.containsKey(i)) {
				if (map.get(i) == 2) {
					dup = i;
				}
			} else {
				missing = i;
			}
			arr[0] = dup;
			arr[1] = missing;
		}

		return arr;
	}
}