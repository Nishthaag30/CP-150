package lec_1;
import java.util.Scanner;
public class patern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=n)
		{
			int i=1;
			while(space>=i)
			{
				System.out.print(" ");
				i++;
			}
			i=1;
			while(star>=i)
			{
				System.out.print("* ");
				i++;
			}
			row++;
			space--;
			star+=1;
			System.out.println();
		}
		
//		while(row<=n)
//		{
//			int i=1;
//			while(i<=space)
//			{
//				System.out.print(" ");
//				i++;
//			}
//			i=1;
//			while(i<=star)
//			{
//				if(i%2==0)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//				i++;
//			}
//			row++;
//			star+=2;
//			space--;
//			System.out.println();
//		}
	}

}
