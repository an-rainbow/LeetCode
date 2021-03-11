

//这个答案虽然不是最优解，但是解题思路还是多看看了解一下
public class Number594 {
	public int findHS(int[] nums) {
		int res = 0;
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			boolean flag = false;

			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == nums[i]) {
					count++;
				}else if(nums[j]+1==nums[i]) {
					count++;
					flag=true;
				}
			}
			if (flag) {
				res = Math.max(count, res);
			}
		}
		return res;
	}

}
