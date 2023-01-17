package OOPS;

public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,3));
		System.out.println(add(2,1,7));
		System.out.println(add(5,7,9.8f));
		System.out.println(add(2,3, 5,8,-15,92,7,-9,-12,8,30));
	}
	public static int add(int a , int b)
	{
		return a+b;
	}
	public static int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public static int add(int a, int b, float c)
	{
		return (int)(a+b+c);
	}
	public static int add(int... a)
	{
		int sum=0;
		for(int i =0;i< a.length; i++)
			sum+= a[i];
		return sum;
	}
}
