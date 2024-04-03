package leetcode;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[i].length; j++)
				if (board[i][j] == word.charAt(0) && find(i, j, 0, word, board))
					return true;
		return false;
	}

	public boolean find(int i, int j, int idx, String word, char[][] board) {
		if (idx == word.length())
			return true;
		if (i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != word.charAt(idx))
			return false;

		char temp = board[i][j];
		board[i][j] = '$';
		if (find(i - 1, j, idx + 1, word, board))
			return true;
		if (find(i, j + 1, idx + 1, word, board))
			return true;
		if (find(i + 1, j, idx + 1, word, board))
			return true;
		if (find(i, j - 1, idx + 1, word, board))
			return true;
		board[i][j] = temp;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new WordSearch().exist(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
	}

}
