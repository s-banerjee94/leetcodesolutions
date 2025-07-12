public class FindTheLexicographicallyLargestStringFromTheBoxI {
	public static String answerString(String word, int numFriends) {
		if(numFriends == 1)
			return word;
		
		int maxLengthPossible = word.length() - (numFriends - 1);

		String result = "";

		for (int i = 0; i < word.length(); i++) {
			int currentLength = Math.min(maxLengthPossible, word.length() - i);
			String currentString = word.substring(i, currentLength + i);
			if (result.compareTo(currentString) < 0) {
				result = currentString;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(answerString("dbca", 2));
	}
}
