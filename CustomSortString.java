package leetcode;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomSortString {
	public String customSortString(String order, String s) {
		Map<Character, Long> charCountMap = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		StringBuilder sb = new StringBuilder();
		for (char c : order.toCharArray()) {
			if (charCountMap.containsKey(c)) {
				long count = charCountMap.get(c);
				for (long i = 0; i < count; i++) {
					sb.append(c);
				}
			}
			charCountMap.remove(c);
		}

		for (Map.Entry<Character, Long> entry : charCountMap.entrySet()) {
			char c = entry.getKey();
			long count = entry.getValue();
			for (long i = 0; i < count; i++) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(new CustomSortString().customSortString("bcafg", "abcd"));
	}

}
