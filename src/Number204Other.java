import java.util.Arrays;

public class Number204Other {
	public int countPrimes(int n) {
		int count=0;
		boolean[]prime=new boolean[n];
		Arrays.fill(prime,true);
		
		for (int i=2;i<n;i++) {
			if(prime[i]) {
				for (int j=2; i*j<n; j++) {
					prime[i*j]=false;
				}
			}
			
		}
		
		for (int i=2; i<n; i++) {
			if(prime[i]==true) {
				count++;
			}
		}
		return count;
	}

}
