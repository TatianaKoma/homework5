package leetCode;

public class Algorithms3SameTree {
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

    //        public boolean isSameTree(TreeNode p, TreeNode q) {
//        if (p == null && q == null) return true;
//        if (q == null || p == null) return false;
//        if (p.val != q.val) return false;
//        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
//    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (q.val != p.val) {
            return false;
        }
        return isSameTree(q.left, p.left) && isSameTree(q.right, p.right);
    }
}
