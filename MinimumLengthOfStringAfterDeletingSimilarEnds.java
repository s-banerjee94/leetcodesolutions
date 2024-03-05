package leetcode;

public class MinimumLengthOfStringAfterDeletingSimilarEnds {
	public int minimumLength(String s) {
		int left = 0;
		int right = s.length() - 1;

		// Continue until there are no characters left or characters at left and right
		// are different
		while (left < right && s.charAt(left) == s.charAt(right)) {
			char ch = s.charAt(left);

			// Find the longest prefix
			while (left < right && s.charAt(left) == ch)
				left++;

			// Find the longest suffix
			while (left <= right && s.charAt(right) == ch)
				right--;
		}

		// Return the remaining length
		return right - left + 1;
	}

	public static void main(String[] args) {
		System.out.println(new MinimumLengthOfStringAfterDeletingSimilarEnds().minimumLength("cabaabac"));

	}

}
