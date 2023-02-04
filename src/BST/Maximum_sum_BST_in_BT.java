package BST;


public class Maximum_sum_BST_in_BT {
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
	class Solution {
		public class BSTpair{
			boolean isbst = true;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			int sum = 0; //BT ka sum
		 	int ans = 0; // BST ka sum
		}
	    public boolean isValidBST(TreeNode root) {
	        return validbst(root).isbst;
	    }
	    public BSTpair validbst(TreeNode root) {
	    	if(root == null)
	    		return new BSTpair();
	    	BSTpair lbst = validbst(root.left);
	    	BSTpair rbst = validbst(root.right);
	    	BSTpair sbst = new BSTpair();
            sbst.sum = lbst.sum + rbst.sum + root.val;
	    	sbst.max = Math.max(rbst.max, Math.max(lbst.max, root.val));
	    	sbst.min = Math.min(rbst.min, Math.min(lbst.min, root.val));
	    	if(lbst.isbst == true && rbst.isbst == true && lbst.max < root.val && rbst.min > root.val) {
	    		sbst.isbst = true;
	    		sbst.ans = Math.max(lbst.ans, Math.max(rbst.ans, sbst.sum));
	    		return sbst;
	    	}
	    	sbst.isbst = false;
	    	sbst.ans = Math.max(lbst.ans, rbst.ans);
	    	return sbst;
	    }
	}

}
