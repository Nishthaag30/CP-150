package backtracking;

public class print_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		printarrayrecursively(arr, 5);
	}
	public static void printarrayrecursively(int[] arr , int n) {
		if(n-1 < 0)
			return;
		printarrayrecursively(arr, n-1);
		System.out.print(arr[n-1] + " ");
	}
}
