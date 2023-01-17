package backtracking;

public class amount_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,7};
		int amount= 10;
		printans(amount, arr, "");
	}
	public static void printans(int amount, int[] arr, String ans)
	{
		if(amount == 0)
		{
			System.out.println(ans);
			return;
		}
		for(int i =0; i<arr.length ;i++)
		{
			if(arr[i]<=amount)
			{
				printans(amount-arr[i], arr, ans+" "+arr[i]);
			}
		}
	}
}


