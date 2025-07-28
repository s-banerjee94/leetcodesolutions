public class CountElementsWithStrictlySmallerAndGreaterElements {
    public int countElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int count = 0;
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        for (int i : nums) {
            if (i > min && i < max)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountElementsWithStrictlySmallerAndGreaterElements solution = new CountElementsWithStrictlySmallerAndGreaterElements();

        int[] nums1 = {11, 7, 2, 15};
        System.out.println("Test case 1: " + solution.countElements(nums1));

        int[] nums2 = {-3, 3, 3, 90};
        System.out.println("Test case 2: " + solution.countElements(nums2));

        int[] nums3 = {1, 1, 1};
        System.out.println("Test case 3: " + solution.countElements(nums3));
    }
}
