

public class Number104 {
	public int maxDepth(TreeNode node) {
        if(node==null){
            System.out.println("Leaf Node");
            return 0;
        }
        System.out.printf("In node:%d\n", node.val);
        
        System.out.printf("Start entering node %d left subtree\n", node.val);
        int leftDepth = maxDepth(node.left);
        System.out.printf("End out node %d left subtree\n", node.val);
        System.out.printf("Node %d's left depth: %d\n", node.val, leftDepth);
        
        System.out.printf("Start entering node %d right subtree\n", node.val);
        int rightDepth = maxDepth(node.right);
        System.out.printf("End out node %d right subtree\n", node.val);
        System.out.printf("Node %d's right depth: %d\n", node.val, rightDepth);
        
        int currDepth = 1 + Math.max(leftDepth, rightDepth);
        System.out.printf("Node %d's depth: %d\n", node.val, currDepth);
        return currDepth;
    }

}
