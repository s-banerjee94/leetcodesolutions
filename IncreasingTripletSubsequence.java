public class IncreasingTripletSubsequence {
	public static boolean increasingTriplet(int[] nums) {
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int n: nums) {
			if(n <= first)
				first = n;
			else if(n <= second)
				second = n;
			else
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(increasingTriplet(new int[] { 5, 4, 3, 2, 1 }));
		System.out.println(increasingTriplet(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(increasingTriplet(new int[] { 2, 1, 5, 0, 4, 6 }));
		System.out.println(increasingTriplet(new int[] { 20, 100, 10, 12, 5, 13 }));
	}
}
