
public class Number680 {
	public boolean validPalindrome(String s) {
		int n=s.length();
		for (int i=0; i<n/2; i++) {
			int left=i;
			int right=n-i-1;
			if(s.charAt(left)!=s.charAt(right)) {
				//give a last chance delete char at left
				if(validSubPalindrome(s, left+1,right)) return true;
				//delete char at right
				return validSubPalindrome(s,left, right-1);
			}
		}
		return true;
	}
	
	private boolean validSubPalindrome(String s, int lo, int hi) {
		int n=hi-lo+1;
		for (int i=0; i<n/2; i++) {
			int left=lo+i;
			int right=hi-i;
			if(s.charAt(left)!=s.charAt(right)) return false;
		}
		return true;
	}

}
