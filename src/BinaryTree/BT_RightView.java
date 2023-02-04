package BinaryTree;

import java.util.*;

import BinaryTree.LCA.TreeNode;

public class BT_RightView {
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
	static int maxlevel;
	public List<Integer> rightsideview(TreeNode root){
		maxlevel = -1;
		List<Integer> li = new ArrayList<>();
		view(root, 0, li);
		return li;
	}
	public void view(TreeNode root, int currlev, List<Integer> li) {
		if(root == null)
			return;
		if(currlev > maxlevel) {
			li.add(root.val);
			maxlevel = currlev;
		}
		view(root.right, currlev+1, li);
		view(root.left, currlev+1, li);
	}
}
