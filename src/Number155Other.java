import java.util.Stack;

public class Number155Other {
	
	Stack<Integer> stack = new Stack();
	Stack<Integer> min_vals = new Stack();
	
	public void push(int x) {
		if(min_vals.isEmpty() || x<min_vals.peek()) {
			min_vals.push(x);
		}
		stack.push(x);
	}
	
	
	public void pop() {
		if (stack.peek().equals(min_vals.peek())) {
			min_vals.pop();
		}
		stack.pop();
		
	}
	
	
	public int top() {
		return stack.peek();
		
	}

	
	public int getMin() {
		return min_vals.peek();
		
	}
}
