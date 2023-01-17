package lec_1;

public class Maximum_sum_of_window_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,1,5,6,7,1,8,9,11,5,7};
		int k=3;
		System.out.println(maxi(arr,k));
	}
	public static int maxi(int[] arr, int k)
	{
		int sum=0;
		int max= Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			sum+= arr[i];
			if(i>=k-1)
			{
				max= Math.max(sum, max);
				sum -= arr[i-k];
			}
			
		}
		return max; 
	}
}

		
//		for(int i=0; i<k; i++)
//			sum+=arr[i];
//		int max= sum;
//		for(int i=k; i<arr.length; i++)
//		{
//			sum += arr[i];
//			sum -= arr[i-k];
//			max= Math.max(max, sum);
//		}