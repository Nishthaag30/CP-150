package recursion;

public class countsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		System.out.println(countpermutation(str,""));

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
	public static int countpermutation(String ques, String ans)
	{
		if(ques.length()== 0) {
			System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int ans1 =countpermutation(ques.substring(1), ans);
		int ans2= countpermutation(ques.substring(1), ans + ch);
		return ans1+ans2;
	}
}
