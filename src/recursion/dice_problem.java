package recursion;

public class dice_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		Printpath(0,n,"");
	}
	public static void Printpath(int curr, int end, String ans)
	{
		if(curr == end)
		{
			System.out.println(ans);
			return;
		}
		if(curr > end)
			return;
//		Printpath(curr+1, end, ans+1);
//		Printpath(curr+2, end, ans+2);
//		Printpath(curr+3, end, ans+3);
		
		for(int dice= 1 ;dice<=3; dice++)
			Printpath(curr + dice, end, ans+dice);
	}
}
