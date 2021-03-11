import java.util.Stack;

public class Number917 {
	
	public String reverseOnlyLetters(String S) {
		Stack<Character> letters=new Stack<>();
		for (char c: letters) {
			if(Character.isLetter(c)) {
				letters.push(c);
			}
		}
		
		StringBuilder ans=new StringBuilder();
		for (char c: letters) {
			if(Character.isLetter(c)) {
				ans.append(letters.pop());
			}else {
				ans.append(c);
			}
		}
		return ans.toString();
	}

}
