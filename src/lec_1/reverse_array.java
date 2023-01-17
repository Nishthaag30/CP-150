package lec_1;
import java.util.*;
public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar= new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		int i=0, j=n-1;
		while(i<=j)
		{
			int temp = ar[i];
			ar[i]= ar[j];
			ar[j]= temp;
			i++;
			j--;
		}
		for(i=0; i<n ;i++)
			System.out.print(ar[i]+" ");
	}

}
