import java.util.Arrays;

public class Number1013 {
	public boolean canThreePartsEqualSum(int[] arr) {
		int sum = Arrays.stream(arr).sum();
		if (sum % 3 != 0) {
			return false;
		}
		int partitionSum = sum / 3;
		int numberOfpartition = 0;
		int tempSum = 0;

		for (int i = 0; i < arr.length; i++) {
			tempSum += arr[i];
			if (tempSum == partitionSum) {
				numberOfpartition++;
				tempSum = 0;
			}
		}
		if (numberOfpartition == 3) {
			return true;
		}
		return false;
	}
}
