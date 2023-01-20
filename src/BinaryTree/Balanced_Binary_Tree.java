package BinaryTree;

import BinaryTree.Diameter_of_the_binary_tree.TreeNode;

public class Balanced_Binary_Tree {
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
		public class Diapair {
			boolean balance = true;
			int ht = -1;
		}
	    public boolean isBalanced(TreeNode root) {
	    	return balance(root).balance;
	    }
	    public Diapair balance(TreeNode root) {
	    	if(root == null)
	    		return new Diapair();
	    	Diapair lb = balance(root.left);
	    	Diapair rb = balance(root.right);
	    	Diapair sb = new Diapair();
	    	boolean b = Math.abs(lb.ht - rb.ht) <=1;
	    	sb.ht = Math.max(lb.ht, rb.ht) + 1;
	    	sb.balance = lb.balance && rb.balance && b;
	    	return sb;
	    }
	}
}
