import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            return null;
        }
    }

    public boolean isSymmnetric(TreeNode root) {
        return isSame(root, root);
    }

    public boolean isSame(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null)
            return true;
        if(node1 == null || node2 == null)
            return false;
        if(node1.val == node2.val)
            isSame(node1.left, node2.right);
        return false;
    }

//    public static void main(String[] args) {
//
//    }
}
