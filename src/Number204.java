import java.util.Arrays;


//youtube: 
// https://www.youtube.com/watch?v=fI6kv_GtKlM


public class Number204 {
	public int countPrimes(int n) {
		int res=0;
		boolean[]prime=new boolean[n+1];
		for (int i=0; i<prime.length;i++) {
			if(prime[i]) {
				for (int j=i*i;j<=n; j+=i) {
					prime[j]=false;
				}
			}
		}
		for (int i=2; i<n;i++) {
			if(prime[i]) res++;
			
		}
		return res;
	}

}
