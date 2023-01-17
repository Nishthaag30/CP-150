package QuesPractice;

import java.util.*;

public class add_two_linkedlist {

	public class Node{
		int val;
		Node next;
	}
	private Node head;
	private Node tail;
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
	public void add(Node head1, Node head2){
		int f = 0;
		Node newhead = null;
		while(head1!=null && head2!=null){
			int x = head1.val + head2.val + f;
			f = x/10;
			Node nn = new Node();
			nn.val = x%10;
			nn.next = newhead;
			newhead = nn;
			head1 = head1.next;
			head2 = head2.next;
		}
		while(head1!=null) {
			int x = head1.val + f;
			f = x/10;
			Node nn = new Node();
			nn.val = x%10;
			nn.next = newhead;
			newhead = nn;
			head1 = head1.next;
		}
		while(head2!=null) {
			int x = head2.val + f;
			f = x/10;
			Node nn = new Node();
			nn.val = x%10;
			nn.next = newhead;
			newhead = nn;	
			head2 = head2.next;
		}
		if(f!=0) {
			Node nn = new Node();
			nn.val = f;
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
		System.out.println("NULL");
	}
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		add_two_linkedlist cc1 = new add_two_linkedlist();
		add_two_linkedlist cc2 = new add_two_linkedlist();
		for(int i=0; i<n; i++)
			cc1.addFirst(sc.nextInt());
		for(int i=0; i<m; i++)
			cc2.addFirst(sc.nextInt());
		cc1.display();
		cc2.display();
		add_two_linkedlist obj = new add_two_linkedlist();
		obj.add(cc1.head, cc2.head);
		obj.display();
    }

}

//
//
//import java.util.*;
//public class Main {
//	public class Node{
//		int data;
//		Node next;
//		Node(int data)
//		{
//			this.data=data;
//		}
//	}
//	private Node head;
//	public void addfirst(int data){
//		Node nn=new Node(data);
//		
//      if(head==null){
//         head=nn;
//         return;}
//      nn.next=head;
//      head=nn;
//			
//	}
//	public Node sum(Node list,Node list2)
//	{
//		Node new_list = null;
//        Node temp = null;
//        int carry = 0;
//   
//        while (list != null || list2 != null) 
//		{
//            int sum = carry;
//            if (list != null) 
//			{
//                sum += list.data;
//                list = list.next;
//            }
//            if (list2!= null) 
//			{
//                sum += list2.data;
//                list2 = list2.next;
//            }
//            Node node = new Node(sum%10);
//		    carry = sum / 10;
//            if (temp == null) {
//                temp = new_list = node;
//            }
//            else 
//			{
//               node.next=new_list;
//               new_list=node;
//
//            }
//        }
//     
//        if (carry > 0)
//		{
//            Node c = new Node(carry);
//           c.next=new_list;
//           new_list=c;
//			
//        }
//        return new_list;
//    }
//	
//	public void display() {
//		Node temp = head;
//		while(temp!=null) {
//			System.out.print(temp.data+" ");
//			temp= temp.next;
//		}}
//	
//	
//    public static void main (String args[]) {
//		Scanner sc= new Scanner(System.in);
//		int n= sc.nextInt();
//		int m=sc.nextInt();
//		Main list =new Main();
//		for(int i=0;i<n;i++)
//			list.addfirst(sc.nextInt());
//		Main list2 =new Main();
//		for(int i=0;i<m;i++)
//			list2.addfirst(sc.nextInt());
//
//		Main obj=new Main()	;
//		obj.head=obj.sum(list.head,list2.head);
//		obj.display();
//
//    }
//}
