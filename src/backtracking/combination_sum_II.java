package backtracking;

import java.util.*;

public class combination_sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,1,2,7,6,1,5};
		int target = 8;
		Arrays.sort(arr);
		List<Integer> li = new ArrayList<>();
		List<List<Integer>> list = new ArrayList<>();
		Combination(arr, target,li, list, 0);
		System.out.println(list);
	}
	public static void Combination(int [] arr, int target, List<Integer> li, List<List<Integer>> list, int idx)
	{
		
		if(target==0)
		{
			list.add(new ArrayList<>(li));
			return;
		}
		for(int i = idx; i<arr.length; i++)
		{
			if(i!=idx && arr[i]==arr[i-1])
				continue;
			if(target>=arr[i])
			{
				li.add(arr[i]);
				Combination(arr, target-arr[i],li, list, i+1);
				li.remove(li.size()-1);
			}
		}
	}
}
