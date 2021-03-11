
public class Number345 {
	
	public String reverseVowels(String s) {
	
	char[]c=s.toCharArray();
	
	int left=0;
	int right=c.length-1;
	
	while (left<right) {
		if(isVowel(c[left]) && isVowel(c[right]) ) {
			swap(c,left,right);
			left++;
			right--;
		}else if(!isVowel(c[left])) {
			left++;
		}else {
			right--;
		}
		
	}
	return String.valueOf(c);
    

}
	
	public boolean isVowel (char c) {
		return c=='a'|| c== 'e'|| c=='i' || c=='o'||c=='u'||c== 'A'|| c== 'E'||
				c== 'I'||c=='O'||c=='U';
	}
	
	public void swap(char[]c, int i, int j) {
		char temp;
		temp=c[i];
		c[i]=c[j];
		c[j]=temp;	
	}
	
	
	public static void main(String[]args) {
		Number345 test=new Number345();
		System.out.println("This is Number345");
		test.reverseVowels("Hello");
		System.out.println(test.reverseVowels("Heaolio"));
	}
}