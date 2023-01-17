package LinkedList;

import java.util.*;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linkedlist list = new Linkedlist();
		list.addLast(12);
		list.addLast(1);
		list.addLast(15);
		list.addLast(10);
		list.addLast(11);
		list.addLast(5);
		list.addLast(6);
		list.addLast(2);
		list.addLast(3);
		list.addLast(89);
		list.deleteLarger();
		list.display();
		
		
	}

}
