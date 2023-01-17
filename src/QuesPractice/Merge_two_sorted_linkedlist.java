package QuesPractice;

import java.util.*;

public class Merge_two_sorted_linkedlist {
	public class Node{
		int val;
		Node next;
	}
	private Node head;	
	public void add(int item) {
		Node nn = new Node();
		nn.val = item;
		if(head == null) {
			head = nn;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = nn;
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+" ");
			temp= temp.next;
		}
		System.out.println();
	}
	public Node merge(Node head1, Node head2) {
		if(head1 == null)
			return head2;
		if(head2 == null)
			return head1;
		Node headd = new Node();
		if(head1.val < head2.val) {
			headd = head1;
			head1 = head1.next;
		}
		else {
			headd = head2;
			head2 = head2.next;
		}
		Node main = headd;
		while(head1!=null && head2!=null) {
			if(head1.val < head2.val) {
				headd.next = head1;
				head1 = head1.next;
				headd = headd.next;
			}
			else {
				headd.next = head2;
				head2 = head2.next;
				headd = headd.next;
			}
		}
		if(head1 != null) {
			headd.next = head1;
		}
		if(head2 !=null) {
			headd.next = head2;
		}
		return main;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			Merge_two_sorted_linkedlist cc1 = new Merge_two_sorted_linkedlist();
			for(int i=0; i<n; i++)
				cc1.add(sc.nextInt());
			int m = sc.nextInt();
			Merge_two_sorted_linkedlist cc2 = new Merge_two_sorted_linkedlist();
			for(int i=0; i<m; i++)
				cc2.add(sc.nextInt());
			
			cc1.display();
			cc2.display();
			Merge_two_sorted_linkedlist x = new Merge_two_sorted_linkedlist();
			x.head = x.merge(cc1.head, cc2.head);
			x.display();
		}
	}

}
