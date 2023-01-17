package lec_1;
import java.util.*;
public class no_submission {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder s = new StringBuilder();
        for(int i=0;i <str.length() ;i++)
        {
            char c = str.charAt(i);
            int cnt = 0;
            for(int j=i; j<str.length(); j++)
                if(c== str.charAt(j))
                    cnt++;
                else break;
            s.append(c);
            s.append(cnt);
        } 
        System.out.print(s.toString());
    }
}





//import java.util.*;
//public class Main {
//  public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int T= sc.nextInt();
//		while(T-- > 0)
//		{
//			int nor= sc.nextInt();
//			int price[]= new int[nor];
//			for(int i=0; i<nor ; i++)
//				price[i]= sc.nextInt();
//			int amount= sc.nextInt();
//			Arrays.sort(price);
//			if(nor ==2 )
//				System.out.println("Deepak should buy roses whose prices are "+price[0]+" and "+price[1]);
//			else
//			{
//				int lo =0;
//				int hi =nor-1;
//				int ans1=0, ans2=0;
//				while(lo<= hi)
//				{
//					int sum= price[lo]+ price[hi];
//					if(sum==amount)
//					{
//						ans1= price[lo];
//						ans2= price[hi];
//						lo++;
//					}
//					else if(sum > amount)
//						hi--;
//					else
//						lo++;
//				}
//				System.out.println("Deepak should buy roses whose prices are "+ans1+" and "+ans2);
//			}
//		}
//  }
//}
















//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//		Scanner sc  = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		for(int i=0; i< n ; i++)
//			arr[i]= sc.nextInt();
//		int i=0; 
//		int j= n-1;
//		while(i<=j)
//		{
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j]= temp;
//			i++;
//			j--;
//		}
//		for(i =0 ;i<n; i++)
//			System.out.println(arr[i]);
//    }
//}