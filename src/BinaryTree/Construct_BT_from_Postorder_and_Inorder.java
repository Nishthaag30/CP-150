package BinaryTree;

import BinaryTree.Construct_BT_from_Preorder_and_Inorder_Traversal.TreeNode;

public class Construct_BT_from_Postorder_and_Inorder {
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
	    public TreeNode buildTree(int[] inorder, int[] postorder) {
	        return create(inorder, 0 , inorder.length - 1, postorder, 0, postorder.length - 1);
	    }
	    private TreeNode create(int[] inorder, int ilo, int ihi, int[] postorder, int plo, int phi){
	        if(plo > phi || ilo > ihi)
	            return null;
	        TreeNode nn = new TreeNode(postorder[phi]);
	        int i = Search(inorder, ilo, ihi, postorder[phi]);
	        int netitem = ihi - i;
	        nn.right = create(inorder, i+1, ihi, postorder, phi - netitem, phi-1);
	        nn.left = create(inorder, ilo, i-1, postorder, plo, phi - netitem - 1);
	        return nn;
	    }
	    private int Search(int[] inorder, int si, int ei, int item) {
		    for(int i=ei; i>=si; i--)
				if(inorder[i] == item)
	    			return i;
	    	return -1;
	    }
	}
}
