public class ReverseStringII {
	public static String reverseStr(String s, int k) {
		char[] str = s.toCharArray();
		for (int i = 0; i < s.length(); i += 2 * k) {
			int start = i;
			int end = Math.min(i + k - 1, s.length() - 1);
			reverse(str, start, end);
		}

		return new String(str);
	}

	private static void reverse(char[] str, int start, int end) {
		// TODO Auto-generated method stub
		while (start < end) {
			char temp = str[start];
			str[start++] = str[end];
			str[end--] = temp;
		}

	}

	public static void main(String[] args) {
		System.out.println(reverseStr("abcde", 4));
	}
}
