package lec_1;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5 , 1));
	}
	//static int f= 1;
	public static int fact(int n , int f)
	{
		if(n==0 || n==1) 
			return f;
		f= f * n;
		return fact(n-1, f);
	}
}
