package QuesPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GoodSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={1,2,2,3,3,2,3};
		int n=7, x= 1;
		System.out.println(goodSubarrays(arr, n, x));
	}
	static long goodSubarrays(int a[], int n, int x){
        // Code Here. 
        if(a.length < x)
            return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int j=0; j<x*3; j++){
            if(!map.containsKey(a[j])){
                map.put(a[j], 1);
            }
            else{
                map.replace(a[j], map.get(a[j]) + 1);
            }
        }
        int count  =0;
        if(isGoodArray(map, x))
            count++;
        int pt=0;
        for(int i=1; i <= a.length-(x*3); i++){
            map.replace(a[pt], map.get(a[pt]) - 1);
            map.replace(a[i+(x*3)-1], map.get(a[i+(x*3)-1]) + 1);
            if(isGoodArray(map, x))
                count++;
            pt++;
        }
        return count;
    }
    public static boolean isGoodArray(Map<Integer, Integer> map, int x){
        ArrayList<Integer> li = new ArrayList<>(map.values());
        int count = 0;
        for(int i=0; i<li.size(); i++){
            if (li.get(i) >=3 )
                count++;
        }
        if(count == x)
            return true;
        return false;
    }
}
