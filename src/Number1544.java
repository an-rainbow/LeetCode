import java.util.Stack;

public class Number1544 {
	
	public String makeGood(String s) {
	        Stack<Character> stack=new Stack<>();
	        char[] c=s.toCharArray();
	        for (int i=0; i<=c.length-2;i++){
	            if(c[i]!=Character.toLowerCase(stack.peek()) && c[i]!=Character.toUpperCase(stack.peek())){
	                stack.push(c[i]);
	                
	            }else{
	                stack.pop();
	                
	            }
	            
	            
	        }
	        return String.valueOf(stack);
	    }

	public static void main (String[]args) {
		Number1544 test=new Number1544();
		System.out.println(test.makeGood("leEeetcode"));
	}
}
