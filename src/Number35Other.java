
public class Number35Other {
	public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;  // this means the value is present and we will returen the index
            else if(nums[i]>target) return i;  // this mean the array value is more that target value and 
			//we havn'e found any match yet this mean the value is not present so we will put target 
			//value in the index of its just greater value that is present at index i
        }
        return nums.length;// we have traversed the whole array and niether able to find the value,
		//nor the value greater then it i.e. target will be added at the end end so return nums.length
    }

}
