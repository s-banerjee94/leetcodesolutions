package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int length = nums.length;
		int[] result = new int[length];
		result[length - 1] = 1;
		for (int i = length - 2; i >= 0; i--) {
			result[i] = result[i + 1] * nums[i + 1];
		}
		int rightProduct = 1;
		for (int i = 0; i < length; i++) {
			result[i] *= rightProduct;
			rightProduct *= nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(new int[] { 1, 2, 3, 4 })));
	}

}
