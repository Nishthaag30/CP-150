package BST;

public class LargestBSTsubtree {
	public class Node{
		int val;
		Node right;
		Node left;
	}
	class Solution {
		public class BSTpair{
			boolean isbst = true;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			int size = 0;
		}
	    public boolean isValidBST(Node root) {
	        return validbst(root).isbst;
	    }
	    public BSTpair validbst(Node root) {
	    	if(root == null)
	    		return new BSTpair();
	    	BSTpair lbst = validbst(root.left);
	    	BSTpair rbst = validbst(root.right);
	    	BSTpair sbst = new BSTpair();
	    	sbst.max = Math.max(rbst.max, Math.max(lbst.max, root.val));
	    	sbst.min = Math.min(rbst.min, Math.min(lbst.min, root.val));
	    	if(lbst.isbst == true && rbst.isbst == true && lbst.max < root.val && rbst.min > root.val) {
	    		sbst.isbst = true;
	    		sbst.size = lbst.size + rbst.size + 1;
	    		return sbst;
	    	}
	    	sbst.isbst = false;
	    	sbst.size = Math.max(lbst.size, rbst.size);
	    	return sbst;
	    }
	}
}
