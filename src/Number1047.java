import java.util.Stack;

public class Number1047 {
	
	public String removeDuplicates(String S) {
		
	        Stack<Character> stack=new Stack<>();
	        char[] c=S.toCharArray();
	        for (char a: c) {
	        	
	        	if(a==stack.peek() && !stack.isEmpty()) {
	        		stack.pop();
	        	}else {
	        		stack.push(a);
	        	}
	        	
	        }
	        
	        
	        
	        
	        return String.valueOf(stack);
	        

}
	
	public static void main(String[]args) {
		Number1047 test=new Number1047();
		test.removeDuplicates("abbaca");
		System.out.println("This is Number1047");
		System.out.println(test.removeDuplicates("abbaca"));
	}
}