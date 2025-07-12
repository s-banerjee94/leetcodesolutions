import java.util.Arrays;

public class MergeTwo2DArraysBySummingValues {
	public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
		int i = 0, j = 0, k = 0;
		int[][] res = new int[nums1.length + nums2.length][2];

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i][0] == nums2[j][0]) {
				res[k++] = new int[] { nums1[i][0], nums1[i][1] + nums2[j][1] };
				i++;
				j++;
			} else if (nums1[i][0] < nums2[j][0]) {
				res[k++] = new int[] { nums1[i][0], nums1[i][1] };
				i++;
			} else {
				res[k++] = new int[] { nums2[j][0], nums2[j][1] };
				j++;
			}
		}

		for (; i < nums1.length; i++)
			res[k++] = new int[] { nums1[i][0], nums1[i][1] };

		for (; j < nums2.length; j++)
			res[k++] = new int[] { nums2[j][0], nums2[j][1] };

		return Arrays.copyOf(res, k);
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(
				mergeArrays(new int[][] { { 1, 2 }, { 2, 3 }, { 4, 5 } }, new int[][] { { 1, 4}, { 3, 2 }, { 4, 1 } })));
	}
}
