import java.util.Arrays;

public class Number561 {
	public int arrayPairSum(int[]nums) {
		Arrays.sort(nums);
		int count=0;
		for (int i=0; i<nums.length; i+=2) {
			count=count+nums[i];
		}
		return count;
	}

	
	public static void main(String[]args) {
		Number561 test=new Number561 ();
	    int []nums= {6,2,6,5,1,2};
	    test.arrayPairSum(nums);
	    System.out.println("This is Number561");
	    System.out.println(test.arrayPairSum(nums));
	}
}
