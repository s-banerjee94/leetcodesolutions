public class FindThePivotInteger {
	public int pivotInteger(int n) {
		int start = 1;
		int end = n;
		int frontSum = 1;
		int endSum = n;

		while (start < end) {
			if (frontSum < endSum) {
				frontSum += ++start;
			} else {
				endSum += --end;
			}
		}
		return frontSum == endSum ? start : -1;
	}

	public static void main(String[] args) {
		System.out.println(new FindThePivotInteger().pivotInteger(8));
	}

}
