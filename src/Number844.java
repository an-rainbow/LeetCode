import java.util.Stack;

public class Number844 {
	
	public boolean backspaceCompare(String S, String T) {
		
		return build(S).equals(build(T));
	}
		
		public String build(String S) {
			char []ss=S.toCharArray();
			Stack <Character> ans=new Stack<>();
			for (char a : ss) {
				if(a=='#' && !ans.isEmpty()) {
					ans.pop();
				}else {
					ans.push(a);
				}	
			}
			
			return String.valueOf(ans);
			
		
		
		//return String.valueOf(stackS).equals(String.valueOf(stackT));
		
		
	}
	
	
	public static void main(String[]args) {
		
		Number844 test=new Number844();
		System.out.println("This is for 844");
		
		System.out.println(test.backspaceCompare("y#fo##f","y#f#o##f"));
		
	}
	//test case should return true
    //这道题如果用上面的解法，这个main函数里的测试结果是false，但是实际上应该是true。
	//后面Number844Test用的也是这个方法，但是对上面这个测试结果也不准，以后再回来看的时候思考一下最优解吧。2/3/20

}