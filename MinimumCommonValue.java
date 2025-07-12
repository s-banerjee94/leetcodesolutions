import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue {
	public int getCommon(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		int min = Integer.MAX_VALUE;
		for (int i : nums1)
			set.add(i);
		for (int i : nums2) {
			if (set.contains(i))
				min = Math.min(i, min);
		}
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	public static void main(String[] args) {
		System.out.println(new MinimumCommonValue().getCommon(new int[] { 1, 2, 3, 6 }, new int[] { 2, 3, 4, 5 }));
	}

}
