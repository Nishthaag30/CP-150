package recursion;

public class print_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abbc";
		subsequence(str,"");

	}
	public static void subsequence(String ques, String ans)
	{
		if(ques.length()== 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		subsequence(ques.substring(1), ans);
		subsequence(ques.substring(1), ans + ch);
	}
}


//package recursion;
//
//import java.util.*;
//
//public class print_subsequence {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str="abc";
//		int nums[] = {1,2,3,4,5,6,7,8,9,10};
//		List<Integer> li = new ArrayList<>();
//		subsequence(nums,li, 0);
//
//	}
//	public static void subsequence(int[] nums, List<Integer> ans, int idx)
//	{
//		if(idx==nums.length) {
//			System.out.println(ans);
//			return;
//		}
//		int ch = nums[idx];
//		subsequence(nums, ans, idx+1);
//		ans.add(ch);
//		subsequence(nums, ans , idx+1);
//		ans.remove(ch);
//	}
//}
