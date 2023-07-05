package dsa_h1102.machine_exercises;

public class BalancedTree {
    public boolean isBalanced(CountNodes.TreeNode root) {
        //If the root is null, the tree is balanced by definition
        if (root == null) {
            return true;
        }

        //Check the heights of the left and right subtrees
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        //If the difference in heights is greater than 1, the tree is not balanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        //Otherwise, check if the left and right subtrees are balanced recursively
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int getHeight (CountNodes.TreeNode root) {
        //If the root is null, the height is 0
        if (root == null) {
            return 0;
        }

        //Calculate the height of the left and right subtrees recursively
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        //Return the maximum height plus 1 (for the root node)
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
