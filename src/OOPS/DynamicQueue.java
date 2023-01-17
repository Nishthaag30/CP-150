package OOPS;

public class DynamicQueue extends Queue{
	@Override
	public void Enqueue(int item) throws Exception
	{
		if(isFull())
		{
			int []a = new int[2*arr.length];
			for(int i =0; i<size; i++)
				a[i]= a[(front+i)%size];
			arr=a;
			front=0;
				
		}
	}
}
