
public class Number744 {
	public char nextGreatestLetter(char[] letters, char target) {
		int low = 0;
		//why high=letters.length not length-1?
		int high = letters.length;
		while (low < high) {
			int mid = low + (high - low) / 2;
			//can we use < here?
			if (letters[mid] <= target) {
				low = mid + 1;
			} else {
				high = mid;
			}

		}
		return letters[low % letters.length];
	}

}
