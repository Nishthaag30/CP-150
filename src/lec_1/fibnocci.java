package lec_1;

import java.util.Scanner;

public class fibnocci {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
//		if(n==1 || n==0)
//			System.out.print("0");
//		else if(n==2)
//			System.out.print("0 1");
//		else
//		{
//			int a=0,b=1;
//			System.out.print(a+" "+b+" ");
//			for(int i=3;i<=n;i++)
//			{
//				int c=a+b;
//				System.out.print(c+" ");
//				a=b;
//				b=c;
//			}
//		}
		int a=0, b=1,i=1;
		while(i<=n)
		{
			int c=a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.print(a+" ");

	}
}
