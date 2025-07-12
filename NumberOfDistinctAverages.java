import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDistinctAverages {
	public static int distinctAverages(int[] nums) {
		Arrays.sort(nums);
		Set<Double> avgs = new HashSet<>();
		for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
			double avg = (nums[i] + nums[j]) / 2.0;
			avgs.add(avg);
		}
		return avgs.size();
	}

	public static void main(String[] args) {
		System.out.println(distinctAverages(new int[] { 4, 1, 4, 0, 3, 5 }));
		System.out.println(distinctAverages(new int[] { 1, 100 }));
		System.out.println("\n" + distinctAverages(new int[] { 9, 5, 7, 8, 7, 9, 8, 2, 0, 7 }));
	}
}
