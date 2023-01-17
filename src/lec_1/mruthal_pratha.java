package lec_1;

import java.util.*;
public class mruthal_pratha {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int nop= sc.nextInt();
		int noc= sc.nextInt();
		int rank[]= new int[noc];
		
		for(int i=0; i<noc; i++)
		{
			int r= sc.nextInt();
			rank[i]= r;
		}
		
		System.out.println(timetaken(rank, nop));
    }
	static int timetaken(int[] rank, int nop)
	{
		int[] pbc= new int[rank.length];
		int[] uar= new int[rank.length];
      	for(int i=0; i<rank.length;i++)
         	uar[i]= rank[i];
		int t=0;
		int p=0;
		
		while(p<nop){
			t++;
			for(int i=0 ; i<rank.length; i++)
			{
				if(t == uar[i])
				{
					p++;
					pbc[i]+= 1;
					uar[i] = uar[i] + rank[i]*(pbc[i]+1);
				}
			}
		}
		return t;
	}
}