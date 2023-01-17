package lec_1;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,-1,4,7,11,9};
		int target= 11, f=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==target)
			{
				System.out.println(i);
				f=1;
			}
		if(f==0)
			System.out.print("-1");
	}

}
