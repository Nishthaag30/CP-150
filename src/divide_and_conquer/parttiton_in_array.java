package divide_and_conquer;

public class parttiton_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,7,2,3,5,1,4};
		int ans = partition(arr, 0, arr.length-1);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+ " ");
		System.out.println("\n"+ans);
	}
	public static int partition(int []arr, int si, int ei)
	{
		int pi=si;
		int item= arr[ei];
		for(int i = si; i<ei;i++)
			if(arr[i] < item)
			{
				int temp= arr[i];
				arr[i]= arr[pi];
				arr[pi]= temp;
				pi++;
			}
		int temp = arr[pi];
		arr[pi]= arr[ei];
		arr[ei]= temp;
		return pi;
	}
}
