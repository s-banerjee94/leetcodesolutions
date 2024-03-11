package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		Set<List<Integer>> resultList = new HashSet<List<Integer>>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] > 0)
				break;
			int right = nums.length - 1;
			int left = i + 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					resultList.add(Arrays.asList(nums[i], nums[left], nums[right]));
					left++;
					right--;
					while (left < right && nums[left] == nums[left - 1])
						left++;
					while (left < right && nums[right] == nums[right + 1])
						right--;

				} else if (sum < 0)
					left++;
				else
					right--;
			}
		}
		return new ArrayList<>(resultList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ThreeSum().threeSum(new int[] { -2, -1, -1, 0, 1, 2 }));
	}

}
