
public class Number441 {
	public int arrangeCoins(int n) {
		
		int count=1;
		while (n>=count) {
			n=n-count;
			count++;
			
		}
		return count-1;
	}
	
	public static void main(String[]args) {
		Number441 test=new Number441();
		System.out.println(test.arrangeCoins(3));
		
	}

}
