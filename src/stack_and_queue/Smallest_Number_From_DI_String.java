package stack_and_queue;

import java.util.*;

public class Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "DDIDDDI";
		System.out.println(smallestNumber(str));
	}
	public static String smallestNumber(String pattern) {
        int arr[] = new int[pattern.length()+1];
        Stack<Integer> st = new Stack<>();
        int k=1;
        for(int i =0; i<=pattern.length(); i++)
        {
        	if(i==pattern.length() || pattern.charAt(i) == 'I'){
        		arr[i] = k++;
        		while(!st.isEmpty())
        		{
        			arr[st.pop()]=k++;
        		}
        	}
        	else 
        		st.push(i);
        }
        String str= "";
        for(int val :arr)
        	str=str+val;
        return str;
	}

}
