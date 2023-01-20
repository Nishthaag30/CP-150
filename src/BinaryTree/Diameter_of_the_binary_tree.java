package BinaryTree;

public class Diameter_of_the_binary_tree {
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
//	Approach- 1
//	class Solution {
//	    public int diameterOfBinaryTree(TreeNode root) {
//	        if(root == null)
//	        	return 0;
//	        int ld = diameterOfBinaryTree(root.left);
//	        int rd = diameterOfBinaryTree(root.right);
//	        int sd = height(root.left) + height(root.right) + 2;
//	        return Math.max(ld, Math.max(rd, sd));
//	    }
//	    public int height(TreeNode root) {
//	    	if(root == null)
//	    		return -1;
//	    	int lh = height(root.left);
//	    	int rh = height(root.right);
//	    	return Math.max(lh, rh) + 1;
//	    }
//	}
	
	
	public class Diapair{
		int ht = -1;
		int d= 0;
	}
	class Solution {
	    public int diameterOfBinaryTree(TreeNode root) {
	    	return diameter(root).d;
	    }
	    public Diapair diameter(TreeNode root) {
	    	if(root == null)
	    		return new Diapair();
	    	Diapair ldp = diameter(root.left);
	    	Diapair rdp = diameter(root.right);
	    	Diapair sdp = new Diapair();
	    	int sd = ldp.ht + rdp.ht + 2;
	    	sdp.d = Math.max(ldp.d, Math.max(rdp.ht, sd));
	    	sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
	    	return sdp;
	    }
	}
}
