package backtracking;

public class queen_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int tq= 2;
		boolean[] board= new boolean[n];
		printanswer(tq, board, 0, "", 0);
		
	}
	public static void printanswer(int tq, boolean[] board, int qpsf, String ans, int i)
	{
		if(qpsf== tq)
		{
			System.out.println(ans);
			return;
		}
		for(; i<board.length; i++)
		{
			if(board[i]==false)
			{
				board[i]=true;
				printanswer(tq, board, qpsf+1, ans+"b"+i+"q"+qpsf, i+1);
				board[i]= false;
			}
			
		}
	}
}
