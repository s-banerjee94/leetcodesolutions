public class StringCompression {
	public static int compress(char[] chars) {
//		with extra space
		/*
		 * int i = 0, j = 0, count = 0; StringBuilder sb = new StringBuilder();
		 * 
		 * while (i < chars.length) { if (chars[j] == chars[i]) { count++; i++; if (i !=
		 * chars.length ) continue; } if (count == 1) sb.append(chars[j]); else
		 * sb.append(chars[j]).append(count); j = i; count = 0; } String str =
		 * sb.toString(); for (int a = 0; a < str.length(); a++) { chars[a] =
		 * str.charAt(a); } return sb.toString().length();
		 */

		int read = 0;
		int write = 0;

		while (read < chars.length) {
			char curr = chars[read];
			int count = 0;

			while (read < chars.length && chars[read] == curr) {
				read++;
				count++;
			}

			chars[write++] = curr;

			if (count > 1) {
				char[] temp = String.valueOf(count).toCharArray();
				for (char ch : temp) {
					chars[write++] = ch;
				}
			}
		}

		return write;

	}

	public static void main(String[] args) {
		System.out.println(compress(new char[] { 'a', 'a', 'b', 'b', 'c', 'c', 'c' }));
	}
}
