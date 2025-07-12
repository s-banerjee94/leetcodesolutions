import java.util.Arrays;

public class ConcatenationOfArray {
	public static int[] getConcatenation(int[] nums) {
		int[] ans = new int[2 * nums.length];
//		int k = 0;
//		for (int i = 1; i <= 2; i++) {
//			for (int j = 0; j < nums.length; j++) {
//				ans[k++] = nums[j];
//			}
//		}
		
		for(int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getConcatenation(new int[] { 1, 2, 1 })));
	}
}
