package BinaryTree;

import java.util.*;

import BinaryTree.Binary_tree.Node;

public class CreateTree_Using_LevelOrder {
	public class Node{
		int data;
		Node right;
		Node left;
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	public CreateTree_Using_LevelOrder() {
		createTree();
	}
	private void createTree() {
		Queue<Node> qq = new LinkedList<>();
		int item  = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		this.root = nn;
		qq.add(nn);
		while(!qq.isEmpty()) {
			Node rv = qq.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if(c1!= -1) {
				Node n = new Node();
				n.data = c1;
				rv.left = n;
				qq.add(n);
			}
			if(c2!= -1) {
				Node n = new Node();
				n.data = c2;
				rv.right = n;
				qq.add(n);
			}
		}
	}
}
