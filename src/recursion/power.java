package recursion;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(poweratob(2, 5 , 1));
	}
	//static int f= 1;
	public static int poweratob(int a , int b, int pro)
	{
		// tail recursion
		if(b==0) 
			return pro;
		pro = pro * a;
		return poweratob(a , b-1, pro);		
	}
//	HEAD recursiom
//	public static int pow(int a, int b)
//	{
//		if(b==0)
//			return 1;
//		int ans= pow( a , b-1);
//		return ans*a;
//	}
}
