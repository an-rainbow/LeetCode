import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//youtube https://www.youtube.com/watch?v=lKuK69-hMcc
public class Number340 {
	public int[] intersect(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length) {
			return intersect(nums2, nums1);
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int num : nums2) {
			int count = map.getOrDefault(num, 0);
			if (count > 0) {
				list.add(num);
				map.put(num, count - 1);
			}
		}

		int[] result = new int[list.size()];
		int i = 0;
		for (int num : list) {
			result[i++] = num;
		}
		return result;
	}

}
