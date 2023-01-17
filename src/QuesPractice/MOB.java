package QuesPractice;

import java.util.Scanner;

public class MOB {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		while(T-- > 0)
		{
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    int K = sc.nextInt();
		    int X = sc.nextInt();
		    int y=1;
		    int d=0;
		    int f=0;
		    while(d<=X)
		    {
		        if(y % K==0)
		        {
		            int nd= d+M+N;
		            if(d<=X && X<=nd){
		                System.out.println("YES");
		                f=1;
		                break;
		            }
		            d= nd;
		            y++;
		        }
		        else{
		            d+=M;
		            y++;
		        }
		    }
		    if(f==0)
		        System.out.println("NO");
		}
	}
}   
