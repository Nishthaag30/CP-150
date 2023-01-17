package time_and_complexity;

public class seive_of_eratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primesieve(100);
	}
	public static void primesieve(int n)
	{
		boolean[] arr= new boolean[n+1];
		//kisi index pe false set h to us index ko prime number consider krenge
		//kisi index pr true set h to us index ko not prime consider krenge
		arr[0] = true;
		arr[1] = true;
		for(int i =2; i<arr.length; i++) {
			if(arr[i]== false)
			{
				for(int j=2; i*j <= n; j++)
					arr[i*j] = true;
			}
		}
		for(int i =2; i<=n; i++)
			if(arr[i] == false)
				System.out.print(i+ " ");
	}
}
