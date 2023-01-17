package time_and_complexity;

public class check_prime_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		for(int i =2; i<n;i++)
			if(isprime(i))
				System.out.println(i+" ");
	}
	public static boolean isprime(int n )
	{
		int div= 2;
		while(div *div <= n)
		{
			if(n % div == 0)
				return false;
			div++;
		}
		return true;
	}
}
