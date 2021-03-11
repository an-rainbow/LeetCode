
public class Number58ThirdTry {
	
	public int lengthOfLastWord(String s) {
		int sum=0;
		int i=s.length()-1;
		
		while(i>=0 && s.charAt(i)==' ') {
			i--;
		}
		
		for (int j=i; j>=0; j--) {
			char c=s.charAt(j);
			if(c!=' ') {
				sum++;
			}else {
				break;
			}
		}
		return sum;
	}

}
