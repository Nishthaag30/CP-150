package QuesPractice;
import java.util.*;
public class Hoodies_At_Coding_Blocks {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		Queue<Integer> que1 = new LinkedList<>();
		Queue<Integer> que2 = new LinkedList<>();
		Queue<Integer> que3 = new LinkedList<>();
		Queue<Integer> que4 = new LinkedList<>();
		for(int i=0; i<op; i++){
			String s = sc.nextLine();
			if(s.charAt(0) == 'E'){
				int x = s.charAt(2);
				int y=0;
				for(int j=4; j<s.length();j++) {
					y= y*10 + (s.charAt(j) - '0');
				}
				if(x==1){
//					for(int k=)
					que1.add(y);
				}
				else if(x==2){
					que2.add(y);
				}
				else if(x==3){
					que3.add(y);
				}
				else{
					que4.add(y);
				}
			}
			else{
				if(!que1.isEmpty())
					System.out.println(1+" "+ que1.remove());
				else if(!que2.isEmpty())
					System.out.println(2+" "+ que2.remove());
				else if(!que3.isEmpty())
					System.out.println(3+" "+ que3.remove());
				else
					System.out.println(4+" "+ que4.remove());
			}
		}
	}

}
