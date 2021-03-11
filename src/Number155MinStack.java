import java.util.Stack;

//this code only use one stack to do the function, which is  confusing. Please refer to 
//Number155Other, which use two stack and much clearer.

public class Number155MinStack {
	Stack<Integer> stack;
	int min;
	public Number155MinStack() {
		this.stack=new Stack<>();
		min=Integer.MAX_VALUE;
	}
	
	public void push(int x) {
		if(x<=min) {
			stack.push(min);
			min=x;
		}
		
		stack.push(x);
	}
	
	public void pop() {
		if(stack.pop()==min) {
			min=stack.pop();
		}
	}
	
	public int top() {
		return stack.peek();
	}
	
	public int getMin() {
		return min;
	}
	
	public static void main(String[]args) {
		Number155MinStack test=new Number155MinStack();
		test.push(2);
		test.push(3);
		test.push(1);
		test.push(4);
		test.push(5);
		test.push(-1);
		int a=test.getMin();
		test.pop();
		int b=test.getMin();
		test.pop();
		int c=test.getMin();
		test.pop();
		int d=test.getMin();
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));
	}
}
