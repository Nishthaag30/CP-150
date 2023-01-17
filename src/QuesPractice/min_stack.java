package QuesPractice;

import java.util.*;

public class min_stack {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.next();
		min_stack st = new min_stack(n);
		for(int i=0 ;i<n; i++){
			if(arr[i].equals("push"))
				st.push(sc.nextInt());
			else if(arr[i].equals("pop") && !st.isEmpty())
				st.pop();
			else if(arr[i].equals("top") && !st.isEmpty())
				System.out.print(st.peek()+" ");
			else if(arr[i].equals("getMin") && !st.isEmpty())
				System.out.print(st.getMin()+" ");
		}
    }
	protected int[] arr;
	protected int top;
	public min_stack() {
		arr= new int[5];
		top= -1;
	}
	public min_stack(int n)
	{
		arr= new int[n];
		top= -1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public void push(int item)
	{
		top++;
		arr[top]= item;
	}
	public int pop()
	{
		int rv= arr[top];
		top--;
		return rv;
	}
	public int peek()
	{
		int rv= arr[top];
		return rv;
	}
	public void display()
	{
		for(int i =0; i<= top; i++)
			System.out.print(arr[i]+" ");
		System.out.println();		
	}
	public int getMin() {
		int min= arr[0];
		for(int i=0; i<= top; i++)
			if(arr[i] < min)
				min= arr[i];
		return min;
	}
}

