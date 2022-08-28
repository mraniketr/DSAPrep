package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L1021 {

    // Definition for a binary tree node.
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

        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            List<Integer> irList = new ArrayList<>();
            q.add(null);

            while (!q.isEmpty()) {

                TreeNode r = q.poll();

                if (r == null) {
                    if (q.isEmpty()) {
                        return res;
                    } else {

                        res.add(irList);
                        System.out.print(res);
                        irList.clear();
                        q.add(null);

                        continue;
                    }
                }

                irList.add(r.val);

                if (r.left != null) {
                    q.add(r.left);
                }
                if (r.right != null) {
                    q.add(r.right);
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        TreeNode t9 = new TreeNode(9);
        TreeNode t15 = new TreeNode(15);
        TreeNode t7 = new TreeNode(7);
        TreeNode t20 = new TreeNode(20, t15, t7);

        TreeNode t1 = new TreeNode(3, t9, t20);

        Solution s1 = new Solution();
        s1.levelOrder(t1);
    }
}
