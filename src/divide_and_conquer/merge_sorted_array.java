package divide_and_conquer;

public class merge_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[] = {2,3,5,7,10,11,15,18};
		int ar2[] = {1,2,3,4,6,10,15,19,20,24,27,28};
		int arr[]= merge_two_array(ar1, ar2);
		for(int i =0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	public static int[] merge_two_array(int []ar1, int[] ar2)
	{
		int n = ar1.length;
		int m = ar2.length;
		int arr[] = new int[n+m];
		int i=0, j=0, k=0;
		while(i<n && j<m)
		{
			if(ar1[i] < ar2[j])
				arr[k++] = ar1[i++];
			else //if(ar1[i] > ar2[j])
				arr[k++] = ar2[j++];
//			else
//			{
//				arr[k++] = ar1[i++];
//				arr[k++] = ar2[j++];
//			}
		}
		while(i<n)
			arr[k++] = ar1[i++]; 
		while(j<m)
			arr[k++] = ar2[j++]; 
		return arr;
	}
}
