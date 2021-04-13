import java.util.LinkedList;
import java.util.List;
import java.util.Stack;



public class Number145Other {
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
	//把preorder反过来就是postorder
	public List<Integer> postorderTraversal(TreeNode root){
    List<Integer> result=new LinkedList<>();
    Stack<TreeNode> stack=new Stack<>();
    
    if(root==null) {
    	return result;
    }
    stack.push(root);
    while(!stack.isEmpty()) {
    	TreeNode node=stack.pop();
    	result.addFirst(node.val);
    	if(node.left!=null) {
    		stack.push(node.left);
    	}
    	if(node.right!=null) {
    		stack.push(node.right);
    	}
    }
    return result;
}
}
