import java.util.ArrayList;

public class Number1389 {
	public int[] createTargetArray(int[] nums, int[] index) {

		if (index.length == 1) {
			return nums;
		}
		int[] res = new int[index.length];
		ArrayList tempArr = new ArrayList();

		// take advantage of ArrayList.add(), so we don't have to
		// manually reorder array elements on each add()
		for (int i = 0; i < nums.length; i++) {
			tempArr.add(index[i], nums[i]);
		}

		// fill int[] with the elements in ArrayList
		for (int k = 0; k < tempArr.size(); k++) {
			// cause ArraList.get() return Object type, we have type cast to an integer
			res[k] = (Integer) tempArr.get(k);
		}
		return retArray;
	}

}
