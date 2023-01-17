package stack_and_queue;

import java.util.*;

public class Sliding_window_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,-1,-3,5,3,6,7};
		
	}
	public static int[] maxSliningWindow(int[] arr, int k)
	{
		Deque<Integer> dq = new LinkedList<Integer>();
		int[] ans= new int[arr.length - k + 1];
		int j=1;
		for(int i=0; i<k; i++) {
			while(!dq.isEmpty() && arr[i] > arr[dq.getLast()])
				dq.removeLast();
			dq.add(i);
		}
		for(int i = k; i<arr.length; i++) {
			while(!dq.isEmpty() && arr[i] > arr[dq.getLast()])
				dq.removeLast();
			dq.add(i);
			if(!dq.isEmpty() && dq.getFirst() == i-k)
				dq.removeFirst();
			ans[j++] = dq.getFirst();
		}
		return ans;
	}

}
