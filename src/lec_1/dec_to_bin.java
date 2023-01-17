package lec_1;
import java.util.*;
public class dec_to_bin {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0)
		{
			int rem= n%10;
			sum= sum+ mul*rem;
			mul*= 5;
			n/=10;
		}
		System.out.println(sum);
	}
}
