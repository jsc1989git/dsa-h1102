package dsa_h1102.machine_exercises;

public class CountNodes {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int countNodes(TreeNode root) {
        //If the root is null, there are no nodes in the tree
        if (root == null) {
            return 0;
        }

        //Otherwise, count the nodes in the left and right subtrees
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        //Add 1 for the root node and return the total count
        return 1 + leftCount + rightCount;
    }
}
