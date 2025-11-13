public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int write = 0;
        int read = 0;
        while (read < nums.length / 2) {
            ans[write++] = nums[read];
            ans[write++] = nums[read + n];
            read++;
        }
        return ans;
    }
}
