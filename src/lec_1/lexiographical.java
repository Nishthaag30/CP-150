package lec_1;

public class lexiographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lexio("kartik", "karan"));
	}
	static int lexio(String s1, String s2)
	{
		int n = s1.length();
		int m = s2.length();
		int i,j;
		for( i=0, j=0; i<n && j<m; i++,j++) {
			int x= s1.charAt(i)- s2.charAt(j);
			if(x>0)
				return -1;
			else if(x<0)
				return 1;
		}
		if(i!=n)
			return 1;
		if(j!=m)
			return -1;
		return 0;
	}
}
