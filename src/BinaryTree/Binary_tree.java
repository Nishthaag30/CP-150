package BinaryTree;

import java.util.Scanner;

public class Binary_tree {
	
	public class Node{
		int val;
		Node right;
		Node left;
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	public Binary_tree(){
		root = createTree();
	}
	private Node createTree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = createTree();
		}
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right = createTree();
		}
		return nn;
	}
	private void display(Node node) {
		if(node == null)
			return;
		String s ="";
		s = "<--" + s + node.val + "-->";
		if(node.left != null)
			s= node.left.val + s;
		else
			s = "." + s;
		if(node.right != null)
			s= s + node.right.val;
		else
			s = s+ ".";
		System.out.println(s);
		display(node.left);
		display(node.right);
	}
	public void display() {
		display(root);
	}
	private void preorder(Node node) {
		if(node == null)
			return;
		System.out.println(node.val);
		preorder(node.left);
		preorder(node.right);
	}
	public void preorder() {
		preorder(root);
		System.out.println();
	}
	public void postorder() {
		postorder(root);
		System.out.println();
	}
	private void postorder(Node node) {
		if(node == null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.val);
	}
	public void inorder() {
		inorder(root);
		System.out.println();
	}
	private void inorder(Node node) {
		if(node == null)
			return;
		inorder(node.left);
		System.out.println(node.val);
		inorder(node.right);
	}
	public boolean search(int item) {
		return search(root, item);
	}
	private boolean search(Node node, int item) {
		if(node == null)
			return false;
		if(node.val == item)
			return true;
		boolean left = search(node.left, item);
		boolean right = search(node.right, item);
		return left || right;
	}
	
	public int Max() {
		return Max(root);
	}
	private int Max(Node node) {
		if(node == null)
			return Integer.MIN_VALUE;
		int left = Max(node.left);
		int right = Max(node.right);
		return Math.max(left,  Math.max(right, node.val));
	}
	
	public int ht() {
		return ht(root);
	}
	private int ht(Node node) {
		if(node == null)
			return -1;
		int left = ht(node.left);
		int right = ht(node.right);
		return Math.max(left, right)+1;
	}
}
