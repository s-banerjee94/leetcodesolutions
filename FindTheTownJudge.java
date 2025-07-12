public class FindTheTownJudge {
	public int findJudge(int n, int[][] trust) {
		int[] trusts = new int[n + 1];
		int[] trusted = new int[n + 1];
		for (int[] i : trust) {
			trusts[i[0]]++;
			trusted[i[1]]++;
		}
		for (int i = 1; i <= n; i++)
			if (trusted[i] == n - 1 && trusts[i] == 0)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(
				new FindTheTownJudge().findJudge(4, new int[][] { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } }));
	}

}
