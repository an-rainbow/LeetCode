
public class Number917Other {
	public String reverseOnlyLetters(String S) {
		StringBuilder ans = new StringBuilder();
		int j = S.length() - 1;
		for (int i = 0; i < S.length() - 1; i++) {
			if (Character.isLetter(S.charAt(i))) {
				while (!Character.isLetter(S.charAt(j))) {
				j--;
				}
				ans.append(S.charAt(j--));
			} else {
				ans.append(S.charAt(i));
			}
		}

		return ans.toString();
	}
}