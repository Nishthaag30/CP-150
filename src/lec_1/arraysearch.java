package lec_1;

public class arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,4,1,3,7,3,6,3};
		int k=0;
		System.out.println(search(arr, k, 0, -1));

	}
	public static int search(int[] arr, int k, int i, int ans)
	{	
		if(i == arr.length)
			return ans;
		
		if(arr[i] == k)
			ans =i;
		return search(arr, k , i+1, ans);
		
		
//		if(i==-1)
//			return -1;	
//		if(arr[i] == k)
//			return i;
//		else
//			return search(arr, k , i-1);
		
	}
}
