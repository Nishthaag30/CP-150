package QuesPractice;

import java.util.Scanner;

public class Binary_Search_using_recurr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		int item = sc.nextInt();
		System.out.println(recurr(arr, 0, n-1, item));
	}
	public static int recurr(int arr[], int lo, int hi, int item) {
		int mid = (lo+hi)/2;
		if(lo<=hi) {
			if(arr[mid] == item)
				return mid;
			if(arr[mid] > item)
				return recurr(arr, lo, mid-1, item);
			if(arr[mid] < item)
				return recurr(arr, mid+1, hi, item);
		}
		return -1;
			
	}

}
