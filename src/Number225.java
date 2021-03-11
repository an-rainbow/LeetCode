import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


//https://www.youtube.com/watch?v=bGlv0VGHed8
//youtube for N225

public class Number225 {
	private Queue<Integer> queue;
	
	public Number225() {
		queue=new LinkedList<>();
	}
	
	public void push(int x) {
		queue.add(x);
		for (int i=0; i<queue.size()-1; i++) {
			int temp=queue.remove();
			queue.add(temp);
		}
	}
		
		
	public int pop() {
		return queue.remove();
	}
	
	public int top() {
		return queue.peek();
	}
	
	public boolean empty() {
		return queue.isEmpty();
	}
	
	
	public static void main(String[]args) {
		Number225 test=new Number225();
		test.push(1);
		test.push(2);
		test.push(3);
		System.out.println(test.pop());
		System.out.println(test.pop());
		
	}
	
	}
	
	
	
	
	
	


