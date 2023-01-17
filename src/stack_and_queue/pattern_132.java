package stack_and_queue;

import java.util.Stack;

public class pattern_132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1,4,2};
		System.out.println(pattern(arr));
	}
	public static boolean pattern(int[] arr)
	{
		Stack<Integer> st = new Stack<>();
		int[] min = new int[arr.length];
		min[0]= arr[0];
		for(int i=1; i<arr.length; i++)
			arr[i]= Math.min(arr[i], min[i-1]);
		for(int j= arr.length-1; j>=0; j--) {
			int ith= min[j];
			while(!st.isEmpty() && ith >= arr[st.peek()]) {
				st.pop();
			}
			if(!st.isEmpty() && arr[j] > arr[st.peek()]) {
				return true;
			}
			st.push(ith);
		}
		return false;
	}

}
