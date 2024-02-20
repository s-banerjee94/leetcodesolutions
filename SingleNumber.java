package leetcode;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		// Initialize the result variable to 0
		int result = 0;
		// Iterate through each number in the array
		for (int num : nums) {
			// Perform the XOR operation with the result
			result ^= num;
		}
		// Return the result, which is the single number that appears only once
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new SingleNumber().singleNumber(new int[] { 4, 1, 2, 1, 2 }));
	}

}
