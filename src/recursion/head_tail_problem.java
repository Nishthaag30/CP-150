package recursion;

public class head_tail_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printHT("", 3);
		
	}
	public static void printHT(String ans , int n )
	{
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		printHT(ans+'H', n-1);
		printHT(ans+'T', n-1);
	}
}
