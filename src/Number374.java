
public class Number374 {
	public boolean isSubsequence(String s, String t) {
		if(t.length()<s.length()) {
			return false;
		}
		
		char[] c1=s.toCharArray();
		char[] c2=t.toCharArray();
		
		int i=0;
		int j=0;
		
		while (i<c1.length && j<c2.length) {
			if(c1[i]==c2[j]) {
				j++;
				i++;
				
			}else {
				j++;
				
			}
		}
		return (i==c1.length);
	}

}
