package OOPS;

public class Queue {
	protected int[] arr;
	protected int front = 0;
	protected int size = 0;
	public Queue()
	{
		arr= new int[5];
	}
	public Queue(int n)
	{
		arr= new int[n];
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public boolean isFull(){
		return size == arr.length-1;
	}
	public void Enqueue(int item) throws Exception
	{
		if(isFull())
			throw new Exception("Queue is full");
		int idx= (front+size) % arr.length;
		arr[idx]= item;
		size++;
	}
	public int Dequeue() throws Exception
	{
		if(isEmpty())
			throw new Exception("Queue is Empty");
		int rv= arr[front];
		front= (front+1) % arr.length;
		size--;
		return rv;
	}
	public int Getfront()
	{
		int rv= arr[front];
		return rv;
	}
	
}
