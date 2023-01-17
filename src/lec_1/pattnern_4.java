package lec_1;

import java.util.Scanner;

public class pattnern_4 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=n)
		{
			int i=1;
			while(i<=space)
			{
				System.out.print("  ");
				i++;
			}
			i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			star++;
			space--;
			row++;
			System.out.println();
		}
	}
}
