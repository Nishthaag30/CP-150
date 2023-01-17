package stack_and_queue;
import java.util.*;
public class Number_of_valid_subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,4,2,5,3};
		System.out.println(count_valid_subarray(nums));
	}
	public static int count_valid_subarray(int[] arr)
	{
		int ans=0;
		Stack<Integer> st = new Stack<>();
		for(int i =0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[i] < st.peek())
				st.pop();
			st.push(arr[i]);
			ans+= st.size();				
		}
		return ans;
	}
}
