package BinaryTree;

import java.util.*;

public class Level_order_traversal {
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
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        Queue<TreeNode> q = new LinkedList<>();
	        Queue<TreeNode> q1 = new LinkedList<>();
	        List<List<Integer>> ans = new ArrayList<>();
	        List<Integer> ll = new ArrayList<>();
	        if(root == null)
	        	return ans;
	        q.add(root);
	        while(!q.isEmpty()) {
	        	TreeNode rv = q.remove();
	        	ll.add(rv.val);
	        	if(rv.left != null) {
	        		q1.add(rv.left);
	        	}
	        	if(rv.right != null) {
	        		q1.add(rv.right);
	        	}
	        	if(q.isEmpty()) {
	        		ans.add(ll);
	        		ll = new ArrayList<Integer>();
	        		q= q1;
	        		q1 = new LinkedList<>();
	        	}
	        }
	        return ans;
	    }
	}
	public List<List<Integer>> zigzagLevelOrder(TreeNode root){
		Queue<TreeNode> q = new LinkedList<>();
		Queue<TreeNode> q1 = new LinkedList<>();
		List<List<Integer>> ans = new ArrayList<>();
		if(root == null)
			return ans;
		int level= 1;
		q.add(root);
		List<Integer> li = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		while(!q.isEmpty()){
			TreeNode rv = q.remove();
			st.push(rv.val);
			if(rv.left != null) q1.add(rv.left);
			if(rv.right != null) q1.add(rv.right);
			if(q.isEmpty()){
				if(level%2 != 0){
					while(!st.isEmpty())
						li.add(st.pop());
						// System.out.print(st.pop()+ " ");
				}
				else{
					for(int i : st)
						li.add(i);
				}
				level++;
				ans.add(li);
				li= new ArrayList<>();
				q= q1;
				q1= new LinkedList();
				st = new Stack<>();
			}
		}
		System.out.print(ans);
		return ans;
	}
}
