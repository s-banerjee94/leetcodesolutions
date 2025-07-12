public class TrappingRainWater {
	public int trap(int[] height) {

		int[] left = new int[height.length];
		int[] right = new int[height.length];
		left[0] = height[0];
		for (int i = 1; i < height.length; i++) {
			left[i] = Math.max(left[i - 1], height[i]);
		}
		right[height.length - 1] = height[height.length - 1];
		for (int i = height.length - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], height[i]);
		int ans = 0;
		for (int i = 0; i < height.length; i++) {
			ans += Math.min(right[i], left[i]) - height[i];
		}
		return ans;

		/*
		 * if (height == null || height.length == 0) { return 0; }
		 * 
		 * int n = height.length; int leftMax = height[0]; int rightMax = height[n - 1];
		 * int left = 0; int right = n - 1; int ans = 0;
		 * 
		 * while (left <= right) { leftMax = Math.max(leftMax, height[left]); rightMax =
		 * Math.max(rightMax, height[right]);
		 * 
		 * if (leftMax < rightMax) { ans += leftMax - height[left]; left++; } else { ans
		 * += rightMax - height[right]; right--; } }
		 * 
		 * return ans;
		 */

	}

	public static void main(String[] args) {
		System.out.println(new TrappingRainWater().trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
	}

}
