package recursion;

public class recurr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rec(5);
	}
	public static void rec(int n )
	{
		if(n==0)
			return;
		System.out.println(n);//tail recursion 
		rec(n-1);
		System.out.println(n);// head recursion
	}
}
