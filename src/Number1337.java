
public class Number1337 {

	public int[] kWeakestRows(int[][] mat, int k) {
		int[] result = new int[k];

		// gather soldiers count into single dimensional array(per row)
		int[] counts = new int[mat.length];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					counts[i]++;
				}
			}
		}

		int index = 0;
		while (k > 0) {
			// make linear search k times and take minimum index to fill in result array
			int minIndex = 0;
			for (int i = 0; i < mat.length; i++) {
				if (counts[i] < counts[minIndex]) {
					minIndex = i;
				}
			}

			result[index++] = minIndex;
			counts[minIndex] = Integer.MAX_VALUE;
			k--;
		}
		return result;
	}

}
