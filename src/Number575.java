import java.util.Arrays;
import java.util.Stack;

public class Number575 {
	public int distributeCandies(int[] candyType) {
		Arrays.sort(candyType);
		Stack<Integer> stack=new Stack<>();
		for (Integer i: candyType) {
			if(i==stack.peek()) {
				stack.pop();
			}
			stack.push(i);
		}
		
		if(candyType.length/2>=stack.size()) {
			return stack.size();
		}else {
			return candyType.length/2;
		}
	}

	public static void main(String[]args) {
		Number575 test=new Number575 ();
		int[] candyType= {1,2,3,4,5,5,6,6,8,2};
		System.out.println(test.distributeCandies(candyType));
	}
}
