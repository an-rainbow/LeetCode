
//youtube: https://www.youtube.com/watch?v=xSs-R1onSpc
public class Number35 {
	public int searchInsert(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int left = 0, right = nums.length - 1;
		int mid;

		while (left + 1 < right) {
			mid = (left + right) / 2;
			if (nums[mid] < target)
				left = mid;
			else if (nums[mid] > target)
				right = mid;
			else
				return mid;
		}
		if (nums[right] < target)
			return right + 1;
		else if (nums[left] >= target)
			return left;
		else
			return right;

	}
}
