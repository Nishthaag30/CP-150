package lec_1;
import java.util.*;
public class pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
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
			star+=2;
			space--;
			row++;
			System.out.println();
		}
	}

}
