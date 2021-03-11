
public class Number283 {
	
	//[0,1,0,3,1,2]
	//[1,3,12,0,0]
	
	public void moveZeros(int[]nums) {
		int i=0;
		int j=1;
		while (i<j && j<nums.length) {
            while (nums[i]!=0 && j<nums.length){
                i++;
                j++;
            }
            
            while (nums[i]==0 && j<nums.length){
			if(nums[j]!=0) {
				nums[i]=nums[j];
				nums[j]=0;
				i++;
				j++;
			}else {
				j++;
			}
		}
        
        
    }		
		}
	}


