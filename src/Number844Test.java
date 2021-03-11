import java.util.Stack;

public class Number844Test {
	public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
    public static void main(String[]args) {
		Number844 test=new Number844();
		System.out.println("This is for 844");
		
		System.out.println(test.backspaceCompare("y#fo##f","y#f#o##f"));
}
}