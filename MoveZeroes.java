public class MoveZeroes {
	public static void moveZeroes(int[] nums) {

//		with swap
		/*
		 * int inserIndex = -1;
		 * 
		 * for (int i = nums.length - 1; i >= 0; i--) { if (nums[i] != 0) { inserIndex =
		 * i; break; } } if (inserIndex == -1) return;
		 * 
		 * int i = 0; while (i < inserIndex) { if (nums[i] == 0) { int j = i; while (j <
		 * inserIndex) { nums[j] = nums[j + 1]; j++; } nums[inserIndex] = 0;
		 * inserIndex--; continue; } i++; }
		 */
		
		int insertPos = 0;
		for(int num: nums) {
			if(num != 0)
				nums[insertPos++] = num;
		}
		
		while(insertPos < nums.length)
			nums[insertPos++] = 0;
	}

	public static void main(String[] args) {
		moveZeroes(new int[] { 0, 1, 0, 3, 12 });
		moveZeroes(new int[] { 0 });
		return;
	}
}
