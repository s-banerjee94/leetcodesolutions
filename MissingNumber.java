public class MissingNumber {
	public int missingNumber(int[] nums) {
		int sum = 0;
		// Finding the sum of all the integers in the array
		for (int i : nums)
			sum += i;
		// The sum of the first n natural numbers is (n * (n + 1)) / 2
	    // The missing number is the difference between the sum of the first n natural numbers and the sum of the array elements
	    return ((nums.length * (nums.length + 1)) / 2) - sum;
	}

	public static void main(String[] args) {
		System.out.println(new MissingNumber().missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
	}

}
