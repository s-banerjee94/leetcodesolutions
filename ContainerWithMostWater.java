package leetcode;

public class ContainerWithMostWater {
	public int maxArea(int[] heights) {
		int maxArea = 0;
		int left = 0;
		int right = heights.length - 1;

		while (left < right) {
			int currentArea = calculateArea(heights, left, right);
			maxArea = Math.max(maxArea, currentArea);

			if (heights[left] < heights[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxArea;
	}

	private int calculateArea(int[] heights, int left, int right) {
		int minHeight = Math.min(heights[left], heights[right]);
		long currentArea = (long) minHeight * (right - left);
		return (int) currentArea; 
	}

	public static void main(String[] args) {
		System.out.println(new ContainerWithMostWater().maxArea(new int[] { 1, 1 }));
	}

}
