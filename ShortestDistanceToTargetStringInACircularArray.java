public class ShortestDistanceToTargetStringInACircularArray {
	public static int closestTarget(String[] words, String target, int startIndex) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(target)) {
				int diff = Math.abs(i - startIndex);
				diff = Math.min(diff, words.length - diff);
				min = Math.min(min, diff);
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	public static void main(String[] args) {
		int val = closestTarget(new String[]{"hello", "i", "am", "leetcode", "hello"}, "hello", 1);
		System.out.println(val);
		val = closestTarget(new String[]{"hello", "i", "am", "leetcode", "hello"}, "hllo", 1);
		System.out.println(val);
		val = closestTarget(new String[]{"a", "b", "leetcode"}, "leetcode", 0);
		System.out.println(val);
	}

}
