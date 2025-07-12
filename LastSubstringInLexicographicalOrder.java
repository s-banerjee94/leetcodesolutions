import java.util.HashSet;
import java.util.Set;

public class LastSubstringInLexicographicalOrder {
	public static String lastSubstring(String s) {

		int j = s.length() - 1;
		char ch = s.charAt(s.length() - 1);
		for (int i = s.length() - 2; i >= 0; i--) {
			if (s.charAt(i) > ch) {
				j = i;
				ch = s.charAt(i);
			} else if (s.charAt(i) == ch && s.substring(i, s.length()).compareTo(s.substring(j, s.length())) > 0) {
				j = i;
			}
		}

		return s.substring(j);

//		int n = s.length();
//	    int i = 0, j = 1, k = 0;
//
//	    while (j + k < n) {
//	        if (s.charAt(i + k) == s.charAt(j + k)) {
//	            k++;
//	        } else if (s.charAt(i + k) < s.charAt(j + k)) {
//	            i = Math.max(i + k + 1, j);
//	            j = i + 1;
//	            k = 0;
//	        } else {
//	            j = j + k + 1;
//	            k = 0;
//	        }
//	    }
//	    return s.substring(i);
	}

	public static int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		int i = 0, j = 0, ans = 0;
		while (j < s.length()) {
			if (set.contains(s.charAt(j))) {
				if (s.charAt(j - 1) == s.charAt(j)) {
					set.clear();
					ans = Math.max(ans, j - i);
					i = j;
				} else {
					set.remove(s.charAt(j));
					ans = Math.max(ans, j - i);
					i++;
				}

			}
			set.add(s.charAt(j));
			j++;
		}

		return Math.max(ans, j - i);
	}

	public static void main(String[] args) {
//		System.out.println(lengthOfLongestSubstring("pwwkew"));
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}
}
