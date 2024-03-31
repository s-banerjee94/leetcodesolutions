package leetcode;

public class CountSubarraysWithFixedBounds {
	public long countSubarrays(int[] nums, int minK, int maxK) {
		int minIndex = -1;
		int maxIndex = -1;
		int culpritIndex = -1;
		long ans = 0;
		int smallIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == minK)
				minIndex = i;
			if (nums[i] == maxK)
				maxIndex = i;
			if (nums[i] > maxK || nums[i] < minK)
				culpritIndex = i;
			smallIndex = Math.min(minIndex, maxIndex);
			int temp = smallIndex - culpritIndex;
			ans += temp <= 0 ? 0 : temp;
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(new CountSubarraysWithFixedBounds().countSubarrays(new int[] { 1,1,1,1 }, 1, 1));
	}

}
