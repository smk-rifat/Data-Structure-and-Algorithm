package DailyChallenge.Trees.SubtreeOfAnotherTree.Approach2;
import DailyChallenge.Trees.TreeNode;
public class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;

        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, root) || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if(s == null || t == null || s.val != t.val) return false;
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }
}

