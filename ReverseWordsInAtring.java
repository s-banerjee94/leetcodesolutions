public class ReverseWordsInAtring {
	public static String reverseWords(String s) {

		StringBuilder sb = new StringBuilder();

		String[] str = s.trim().split("\\s+");
		for (int i = str.length - 1; i >= 0; i--) {
			sb.append(str[i]);
			if (i != 0)
				sb.append(" ");
		}
		return sb.toString();

		/* two pointer solution */

//		s = s.trim(); // remove leading/trailing spaces
//		int i = s.length() - 1;
//		int j = i;
//		StringBuilder result = new StringBuilder();
//
//		while (i >= 0) {
//			// Move i to the start of the word
//			while (i >= 0 && s.charAt(i) != ' ')
//				i--;
//
//			// Extract word from i+1 to j
//			result.append(s.substring(i + 1, j + 1));
//			result.append(" ");
//
//			// Skip multiple spaces
//			while (i >= 0 && s.charAt(i) == ' ')
//				i--;
//
//			// Set j to the new end of the next word
//			j = i;
//		}
//
//	return result.toString().trim(); // remove trailing space

	}

	public static void main(String[] args) {
		reverseWords("abc def");
	}
}
