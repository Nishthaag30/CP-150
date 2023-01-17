package OOPS;

public class stack {
	protected int[] arr;
	protected int top;
	public stack() {
		arr= new int[5];
		top= -1;
	}
	public stack(int n)
	{
		arr= new int[n];
		top= -1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull()
	{
		return top == arr.length - 1;
	}
	public void push(int item) throws Exception
	{
		if(isFull())
			throw new Exception("Bklol stack full ho gya h");
		top++;
		arr[top]= item;
	}
	public int pop() throws Exception
	{
		if(isEmpty())
			throw new Exception("Bklol stack empty h");
		int rv= arr[top];
		top--;
		return rv;
	}
	public int peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("Bklol stack empty h");
		int rv= arr[top];
		return rv;
	}
	public void display()
	{
		for(int i =0; i<= top; i++)
			System.out.print(arr[i]+" ");
		System.out.println();		
	}
}
