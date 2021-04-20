import java.util.LinkedList;
import java.util.List;

public class Number144 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new LinkedList<>();

		if (root != null) {
			result.add(root.val);
			result.addAll(preorderTraversal(root.left));
			result.addAll(preorderTraversal(root.right));
		}
		return result;
	}
}
