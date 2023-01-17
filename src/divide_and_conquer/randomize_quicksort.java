package divide_and_conquer;
import java.util.*;
public class randomize_quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void sort(int[] arr, int si, int ei)
	{
		if(si > ei)
			return;
		int pi= partition(arr, si, ei);
		sort(arr, si, pi-1);
		sort(arr, pi+1, ei);
	}
	public static int partition(int []arr, int si, int ei)
	{
		int pi=si;
		int item= arr[ei];
		for(int i = si; i<ei;i++)
			if(arr[i] < item)
			{
				int temp= arr[i];
				arr[i]= arr[pi];
				arr[pi]= temp;
				pi++;
			}
		int temp = arr[pi];
		arr[pi]= arr[ei];
		arr[ei]= temp;
		return pi;
	}
	public static void swap(int []arr, int si, int ei)
	{
		Random r = new Random();
		int idx= r.nextInt(ei-si+1) + si;
		 
		                                                                   41++
		                                                                   
	}
}
