
public class Number852 {
	public int peakIndexInMountainArray(int []arr) {
		int lo = 0, hi = arr.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (arr[mi] < arr[mi + 1])
                lo = mi + 1;
            else
                hi = mi;
        }
        return lo;
	}
	
	public static void main(String[]args) {
		int[]arr= {1,2,4,5,4,3,2,0};
		Number852 test=new Number852();
		System.out.println(test.peakIndexInMountainArray(arr));
	}

}
