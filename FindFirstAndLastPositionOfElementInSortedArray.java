public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {findFirstPosition(nums, target), findLastPosition(nums, target)};
    }

    private int findLastPosition(int[] nums, int target) {
        int index = -1;
         int left = 0;
         int right  = nums.length - 1;
         while (left <= right) {
             int mid = left + (right - left) / 2;
             if(target == nums[mid]) {
                 index = mid ;
                 left = mid + 1;
             } else  if (target < nums[mid]) {
                 right = mid - 1;
             } else {
                 left = mid + 1;
             }
         }
         return index;
    }

    private int findFirstPosition(int[] nums, int target) {
        int index = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                index = mid;
                right = mid - 1;
            } else if(target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        FindFirstAndLastPositionOfElementInSortedArray solution = new FindFirstAndLastPositionOfElementInSortedArray();
        int[] nums = {2, 2};
        int target = 2;
        int[] result = solution.searchRange(nums, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }
}
