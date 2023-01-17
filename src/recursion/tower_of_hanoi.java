package recursion;

public class tower_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toh(3,"A", "B", "C");
	}
	public static void toh(int n , String src, String hlp, String des)
	{
		if(n==0)
			return;
		toh(n-1, src, des, hlp);
		System.out.println("Move "+n+"th disc from "+src+" to "+des);
		toh(n-1, hlp, src, des);
	}
}
 