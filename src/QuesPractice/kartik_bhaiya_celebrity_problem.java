package QuesPractice;

import java.util.*;

public class kartik_bhaiya_celebrity_problem {

//	public static void main(String args[]) {
////		Scanner sc = new Scanner(System.in);
////		Stack<Integer> st = new Stack<>();
////		
////		int n =sc.nextInt();
////		int arr[][] = new int[n][n];
////		for(int i=0; i<n; i++)
////			for(int j =0; j<n; j++)
////				arr[i][j] = sc.nextInt();
////		boolean flag= false;
////		Queue<String> que = new LinkedList<>();
////		for(int i=0; i<n; i++){
////			String s="";
////			for(int j =0; j<n; j++){
////				s= s+ arr[i][j];
////			}
////			if(!que.isEmpty())
////				que.add(s);
////			else
////				
////		}
//		String pattern = "abba", s = "cat cat cat cat";
//		System.out.println(wordPattern(pattern, s));
//    }
//	public static boolean wordPattern(String pattern, String s) {
//        String str[] = s.split(" ");
//        if(str.length != pattern.length())
//            return false;
//        Map<String, Integer> set = new HashMap<>();
//        for(int i = 0; i<pattern.length(); i++){
//            if(!set.containsKey(str[i]))
//                set.put(str[i], pattern.charAt(i) - 'a');
//            else if(set.get(str[i]) != pattern.charAt(i) - 'a')
//            	return false;
//        }
//        Set<Integer> st = new HashSet<>(set.values());
//        if(set.size() != st.size())
//        	return false;
//        return true;
//    }
//	public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//		int t= sc.nextInt();
//		while(t-- > 0){
//			int n = sc.nextInt();
//			int k = sc.nextInt();
//			int arr[] = new int[n];
//			for(int i=0; i<n; i++)
//				arr[i] = sc.nextInt();
//			Queue<Integer> que = new LinkedList<>();
//			
//			for(int i=0; i<n-k+1 ;i++){
//				int f=0;
//				for(int j=0; j<k;j++)
//					if(arr[i+j] < 0){
//						que.add(arr[i+j]);
//						f=1;
//						break;
//					}
//				if(f==0)
//					que.add(0);
//			}
//			for(int i=0; i<que.size(); i++)
//				System.out.print(que.remove()+" ");
//
//		}
//    }
	public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
		int t= 1;
		while(t-- > 0){
			int n = 8;
			int k = 3;
         int arr[][] = {{10,16},{2,8},{1,6},{7,12}};
			Queue<Integer> que = new LinkedList<>();
			Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
			for(int i=0; i<arr.length ;i++){
				for(int j=0;j<arr[0].length; j++)
				System.out.print(arr[i][j]+" ");
				System.out.println();
			}
		}
    }


}
