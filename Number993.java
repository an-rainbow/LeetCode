import java.util.LinkedList;
import java.util.Queue;

public class Number993 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
		      }
		  }
	
	
	public boolean isCousins(TreeNode root, int x, int y) {
		Queue<TreeNode>queue=new LinkedList<>();
		if(root==null) {
			return false;
		}
		
		queue.add(root);
		int depthX=-1;
		int depthY=-2;
		int level=0;
		while(!queue.isEmpty()) {
			int size=queue.size();
			for (int i=0; i<size; i++) {
				TreeNode node=queue.remove();
				if(node.left!=null && node.right!=null) {
					if(node.left.val==x && node.right.val==y) {
						return false;
					}
					if(node.left.val==y && node.right.val==x) {
						return false;
					}
					
					if(node.val==x) {
						depthX=level;
					}
					if(node.val==y) {
						depthY=level;
					}
					if(node.left!=null) {
						queue.add(node.left);
					}
					if(node.right!=null) {
						queue.add(node.right);
					}
					
				}
			}
			level++;
		}
		return depthX==depthY;
	}

}
