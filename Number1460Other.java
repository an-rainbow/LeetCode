
public class Number1460Other {
	
	//O(n)
	
	public boolean canBeEqual(int[]target, int[]arr) {
		int[] count=new int[1001];
		for(int i=0; i<target.length; i++) {
			count[target[i]]+=1;
			count[arr[i]]-=1;
		}
		
		for(int c: count) {
			if(c!=0) {
				return false;
			}
		}
		
		return true;
	}

}
