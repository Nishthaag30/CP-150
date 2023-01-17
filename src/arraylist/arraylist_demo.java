package arraylist;

import java.util.*;

public class arraylist_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		//add elemnt
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		
		//add element at particular index
		list.add(1,-9);
		System.out.println(list);
		HashSet<Character> map = new HashSet();
		
		//get
		System.out.println(list.get(2));
		
		
		//remove
		System.out.println(list.remove(1));
		System.out.println(list);
		
		
		//update
		System.out.println(list.set(1, -90));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+" ");
		for(int v : list)
			System.out.print(v+" ");
	}

}
