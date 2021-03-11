
public class Number125 {
	public boolean isPalindrome(String s) {
		s.toLowerCase();
		char[]stringS=s.toCharArray();
		int i=stringS.length-1;
		int j=0;
		while(i>j){
			if(stringS[i]==stringS[j]) {
				j++;
				i--;
			}
		}
		if(i<=j) {
			return true;
			
		}
		return false;
		
	}

}
