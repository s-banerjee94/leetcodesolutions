public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];
        dp[1]= Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i -1], dp[i -2] + nums[i]);
        }
        return dp[nums.length - 1];

    }

    public static void main(String[] args) {
        HouseRobber robber = new HouseRobber();
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {2, 7, 9, 3, 1};

        System.out.println("Max amount for test1: " + robber.rob(test1));
        System.out.println("Max amount for test2: " + robber.rob(test2));
    }
}
