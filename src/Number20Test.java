import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Number20Test {

	 HashMap<Character, Character> mappings=new HashMap<>();

	
		public void function2() {
		
		mappings.put(')', '(');
		mappings.put('}', '{');
		mappings.put(']', '[');
	}
	
	
	
	public boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (mappings.containsKey(c)) {
				char topElement = stack.empty() ? '#' : stack.pop();
				if (topElement != mappings.get(c)) {
					return false;
				}

			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		//Map<Character, Character> m = new HashMap<Character, Character>();
	    Number20Test test=new Number20Test();
	    test.function2();
		test.mappings.put('a', 'c');
		// test.put();
		//test.isValid("[]{}(){[");
		System.out.println("This is the Number20Test");
		System.out.println(test.isValid("()["));
	}
}
