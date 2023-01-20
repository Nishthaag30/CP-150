package BinaryTree;

import BinaryTree.Diameter_of_the_binary_tree.TreeNode;

public class Construct_BT_from_Preorder_and_Inorder_Traversal {
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
}
