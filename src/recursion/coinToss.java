package recursion;

public class coinToss {

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
		if(ans.length()==0  || (ans.charAt(ans.length()-1)!='H'))
			printHT(ans+'H', n-1);
		printHT(ans+'T', n-1);
	}
}
