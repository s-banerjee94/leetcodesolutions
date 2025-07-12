public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
	public static int isPrefixOfWord(String sentence, String searchWord) {

		int i = 0;
		int spaceCount = 0;
		int j = 0;

		while (i < sentence.length()) {
			if (i == 0 || sentence.charAt(i - 1) == ' ') {
				j = 0;
				spaceCount++;
				if (j < searchWord.length() && sentence.charAt(i) == searchWord.charAt(j)) {
					while (j < searchWord.length() && i < sentence.length()
							&& sentence.charAt(i) == searchWord.charAt(j)) {
						i++;
						j++;
					}
				} else {
					i++;
				}
				if (j == searchWord.length())
					return spaceCount;
			} else
				i++;
		}
		return -1;

	}

	public static void main(String[] args) {
		System.out.println(isPrefixOfWord("b bu bur burg burger", "burg"));
		System.out.println(isPrefixOfWord("this problem is an easy problem", "pro"));
	}
}
