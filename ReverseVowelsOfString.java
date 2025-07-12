import java.util.Set;

public class ReverseVowelsOfString {
	public static String reverseVowels(String s) {

		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		char[] newStr = s.toCharArray();
		int i = 0, j = newStr.length - 1;

		while (i < j) {
			while (!vowels.contains(newStr[i]) && i < j)
				i++;
			while (!vowels.contains(newStr[j]) && i < j)
				j--;
			if (i < j) {
				char temp = newStr[i];
				newStr[i] = newStr[j];
				newStr[j] = temp;
			}
			i++;
			j--;

		}

		return new String(newStr);
	}

	public static void main(String[] args) {
//		reverseVowels("leetcode");
		reverseVowels("ddcc");
	}
}
