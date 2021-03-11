import java.util.HashMap;
import java.util.Stack;

public class Number496 {
	
	//https://www.youtube.com/watch?v=KZhjUwuMC0Y
	//Youtube 从中间开始看就行
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	HashMap<Integer, Integer> map=new HashMap<>();
	int []res=new int[nums1.length];
	Stack <Integer> stack=new Stack<>();
	for (int i=nums2.length-1;i>=0;i--) {
		while(!stack.empty() && nums2[i]>stack.peek()) {
			stack.pop();
		}
		if(stack.empty()) {
			map.put(nums2[i],-1);
		}
		else {
			map.put(nums2[i], stack.peek());
		}
		stack.push(nums2[i]);
	}
    for (int i=0; i<nums1.length;i++) {
    	res [i]=map.get(nums1[i]);
    }
    return res;
}
	}
