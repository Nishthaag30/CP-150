package QuesPractice;
import java.util.*;

public class Importance_of_time {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		for(int i =0; i<n;i++)
			que.add(sc.nextInt());
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		int count = 0;
		for(int i=0; i<n; i++) {
			while(!que.isEmpty() && que.peek()!=arr[i]) {
				que.add(que.remove());
				count++;
			}
			que.remove();
			count++;
		}
		System.out.println(count);
	}

}
