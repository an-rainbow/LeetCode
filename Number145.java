import java.util.LinkedList;
import java.util.List;



public class Number145 {
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
	
	public List<Integer> postorderTraversal(TreeNode root){
		List<Integer> result=new LinkedList<>();
		if(root!=null) {
			result.addAll(postorderTraversal(root.left));
			result.addAll(postorderTraversal(root.right));
			result.add(root.val);
		}
		
		return result;
	}

}
