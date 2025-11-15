public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxCurr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxCurr = Math.max(nums[i], maxCurr + nums[i]);
            maxSum = Math.max(maxSum, maxCurr);
        }
        return maxSum;
    }
}
