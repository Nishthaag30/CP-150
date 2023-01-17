package backtracking;

import java.util.*;

public class partioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<String>();
		List<List<String>> list = new ArrayList<>();
		partition("nitin", li, list);
		for(List<String> c : list)
		{
			for(String ch: c)
				System.out.print(ch+" ");
			System.out.println();
		}

	}
	public static void partition(String ques, List<String> li, List<List<String>> list)
	{
		if(ques.length()==0) {
//			System.out.println(li);
			list.add(new ArrayList<>(li));
			return;
		}
		for(int cut= 1; cut<= ques.length();cut++)
		{
			String s = ques.substring(0,cut);
			if(ispalindrome(s))
			{
				li.add(s);
				partition(ques.substring(cut) ,li, list);
				li.remove(li.size()-1);
			}
		}
	}
	
	public static boolean ispalindrome(String s)
    {
        int i=0,j= s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!= s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
