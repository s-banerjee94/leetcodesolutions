public class RemoveDuplicatesFromSortedArray {
	public static int removeDuplicates(int[] nums) {
		int insertPos = 0;
		int read = 0;
		while(read < nums.length) {
			int curr = nums[read];
			while(read < nums.length && nums[read] == curr)
				read++;
			
			nums[insertPos++] = curr;
		}
		
		return insertPos;

	}
	
	public static void main(String[] args) {
		removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4});
	}
}
