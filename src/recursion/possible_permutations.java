package recursion;

public class possible_permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("ABCD", "");
	}
	public static void permutation(String ques, String ans)
	{
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length(); i++)
		{
			
			char c= ques.charAt(i);
			permutation(ques.substring(0,i)+ques.substring(i+1), ans+c);
		}
		
	}
}
