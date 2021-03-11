

//youtube: https://www.youtube.com/watch?v=JtZBs9Qy_6M
public class Number69 {
	public int mySqrt(int x) {
		if (x <= 0)
			return 0;

		int magicNum = (int) Math.sqrt(Integer.MAX_VALUE);
		int left = 1, right = magicNum;

		// 模版
		while (left + 1 < right) {
			int mid = left + (right - left) / 2;
			if (mid * mid == x)
				return mid;
			if (mid * mid > x)
				right = mid;
			else
				left = mid;
		}

		// right*right<n happens when x is close to MAX_VALUE
		if (right * right <= x)
			return right;
		else
			return left;

	}
}