package divide_and_conquer;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,1,4,5,8,-11};
		int []ans= sort(arr, 0, arr.length-1);
		for(int i=0; i< ans.length; i++)
			 System.out.print(ans[i] + " ");
	}
	public static int[] sort(int[] arr, int si, int ei)
	{
		if(si == ei)
		{
			int []bs= new int[1];
			bs[0] = arr[si];
			return bs;
		}
		int mid= (si+ei) / 2;
		int []fs= sort(arr, si, mid);
		int []ss= sort(arr, mid+1, ei);
		return merge_two_array(fs, ss);
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
			else
				arr[k++] = ar2[j++];
		}
		while(i<n)
			arr[k++] = ar1[i++]; 
		while(j<m)
			arr[k++] = ar2[j++]; 
		return arr;
	}
}
