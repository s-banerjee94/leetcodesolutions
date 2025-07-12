import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
	public int maxFrequencyElements(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int max = 0;
		for (int i : nums) {
			map.merge(i, 1, Integer::sum);
			max = Math.max(max, map.get(i));
		}
		int result = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				result += entry.getValue();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out
				.println(new CountElementsWithMaximumFrequency().maxFrequencyElements(new int[] { 1,2,3,4,5 }));
	}

}
