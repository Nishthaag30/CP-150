package LinkedList;

import java.util.*;

public class Linkedlist {
	private class Node{
		int val;
		Node next;
		Node(){}
		Node(int data, Node next) {
			this.val = data;
			this.next = next;
		}
	}
	private Node head;
	private Node tail; // tail.next = null
	private int size;
	
	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if(this.size==0) {
			head = nn;
			tail = nn;
			size++;
		}
		else {
			nn.next = head;
			head = nn;
			size++;
		}	
	}
	public void addLast(int item) {
		if(size==0)
			addFirst(item);
		else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	private Node getNode(int k) throws Exception{
		if(k<0 || k >= size) {
			throw new Exception("Out of range");
		}
		Node temp = head;
		for(int i= 1; i<=k; i++)
			temp = temp.next;
		return temp;
	}
	public void addatindex(int item, int k) throws Exception{
		if(k<0 || k>size) {
			throw new Exception("Out of Range");
		}
		if(k==0)
			addFirst(item);
		else if(k==size)
			addLast(item);
		else {
			Node k_1th = getNode(k-1);
			Node nn = new Node();
			nn.val = item;
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}
	}
	
	
	public int getFirst() {
		return head.val;
	}
	public int getLast() {
		return tail.val;
	}
	public int getatindex(int k) throws Exception {
		return getNode(k).val;
	}
	
	public int removeFirst() {
		Node temp = head;
		if(size == 1) {
			head = null;
			tail = null;
			size--;
		}
		else {
			head = head.next;
			temp.next = null;
			size--;
		}
		return temp.val;
	}
	public int removeLast() throws Exception {
		if(size == 1) {
			return removeFirst();
		}
		else {
			Node ss= getNode(size - 2);
			int rv = tail.val;
			tail = ss;
			tail.next = null;
			size--;
			return rv;
		}
	}
	
	public int removeatindex(int k) throws Exception{
		if(k==0)
			return removeFirst();
		else if(k== size-1)
			return removeLast();
		else {
			Node prev = getNode(k-1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}
	}
	public void deleteLarger() throws Exception {
		Node temp = head;
		Stack<Integer> st = new Stack<>();
		while(temp != null){
			if(!st.isEmpty()){
				while(!st.isEmpty() && temp.val > st.peek()) {
					st.pop();
				}
			}
			st.push(temp.val);
			temp = temp.next;			
		}
		System.out.println(st);
		Node newhead = null;
		while(!st.isEmpty()){
			Node nn = new Node(st.pop(), null);
			nn.next = newhead;
			newhead = nn;
		}
		head = newhead;	
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.print("NULL");
	}
	
}
