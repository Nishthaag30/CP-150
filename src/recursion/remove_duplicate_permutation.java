package recursion;

public class remove_duplicate_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("ABCA", "");
	}
	public static void permutation(String ques, String ans)
	{
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length(); i++)
		{
			char c= ques.charAt(i);
			boolean f= false;
			for(int j = i+1; j<ques.length();j++)
				if(c== ques.charAt(j))
				{
					f=true;
					break;
				}
			if(!f)
			permutation(ques.substring(0,i)+ques.substring(i+1), ans+c);
		}
		
	}

}
