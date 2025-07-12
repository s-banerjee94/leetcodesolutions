public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		int write = 0;
		for(int in : nums) {
			if(in != val) {
				nums[write++] = in;
			}
		}
		return write;
	}

	public static void main(String[] args) {
		removeElement(new int[] {  3, 2, 2, 3 }, 3);
	}
}
