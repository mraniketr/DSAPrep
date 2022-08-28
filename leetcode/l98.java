package leetcode;

public class l98 {

    static class TreeNode {
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

    static class Solution {
        public boolean isValidBST(TreeNode root) {
            return inOrderT(root);
        }

        int c = Integer.MIN_VALUE;

        public boolean inOrderT(TreeNode root) {

            if (root == null)
                return true;

            boolean l = inOrderT(root.left);
            if (!l)
                return false;
            System.out.print(root.val + " " + c + "\n");
            if (c > root.val)
                return false;
            c = root.val;

            return inOrderT(root.right);

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2, t1, t1);
        sol.isValidBST(t2);
    }
}
