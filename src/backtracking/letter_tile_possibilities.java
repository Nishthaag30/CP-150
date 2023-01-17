package backtracking;

public class letter_tile_possibilities {
	public static void main(String args[])
	{
		int freq[] = new int[26];
		String str= "AAABBC";
		for(int i=0; i<str.length(); i++)
			freq[str.charAt(i) - 'A']++;
		System.out.println(tile_possible(freq, ""));
	}
	public static int tile_possible(int []freq, String ans)
	{
		System.out.println(ans);
		int count=0;
		for(int i= 0; i<freq.length; i++)
		{
			if(freq[i] >=1)
			{
				char ch= (char)(i+'A');
				freq[i]--;
				count += tile_possible(freq, ans+ch) +1;
				freq[i]++;
			}
		}
		return count;
	}
}
