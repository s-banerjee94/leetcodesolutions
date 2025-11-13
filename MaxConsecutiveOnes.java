public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currentMax = 0;
        for(int el : nums) {
            if(el == 1)
                currentMax++;
            else
                currentMax = 0;
            max = Math.max(max, currentMax);
        }
        return max;
    }
}
