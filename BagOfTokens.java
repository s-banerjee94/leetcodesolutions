import java.util.Arrays;

public class BagOfTokens {
	public int bagOfTokensScore(int[] tokens, int power) {
		Arrays.sort(tokens);
		int front = 0;
		int back = tokens.length - 1;
		int score = 0;

		while (front <= back) {
			if (tokens[front] <= power) {
				power -= tokens[front++];
				score++;
			} else if (score > 0 && front != back) {
				power += tokens[back--];
				score--;
			} else {
				break;
			}
		}
		return score;
	}

	public static void main(String[] args) {
		System.out.println(new BagOfTokens().bagOfTokensScore(new int[] { 100}, 50));
	}

}
