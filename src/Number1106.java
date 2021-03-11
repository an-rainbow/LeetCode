import java.util.Arrays;

public class Number1106 {
	public int countCharacters(String[] words, String chars) {
		int[] c = new int[128];
		for (char ch : chars.toCharArray()) {
			c[ch]++;
		}

		int res = 0;
		for (String s : words) {
			int[] c2 = Arrays.copyOf(c, 128);
			boolean valid = true;
			for (char ch : s.toCharArray()) {
				c2[ch]--;

				if (c2[ch] < 0) {
					valid = false;
					break;
				}
			}
			if (valid) {
				res = res + s.length();
			}
		}
		return res;
	}

}
