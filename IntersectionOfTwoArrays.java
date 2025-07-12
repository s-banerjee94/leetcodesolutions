import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		// approach one
		/* 
		 * Arrays.sort(nums1); Arrays.sort(nums2); int i = 0; int j = 0; Set<Integer>
		 * intersection = new HashSet<>(); while (i < nums1.length && j < nums2.length)
		 * { if (nums1[i] == nums2[j]) { intersection.add(nums1[i]); i++; j++; } else if
		 * (nums1[i] < nums2[j]) { i++; } else { j++; } } return
		 * intersection.stream().mapToInt(Number::intValue).toArray();
		 */
		
		Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
		Set<Integer> result = new HashSet<>();
		for(int i : nums2)
			if(nums1Set.contains(i))
				result.add(i);
		return result.stream().mapToInt(Number::intValue).toArray();
				
	}

	public static void main(String[] args) {
		System.out.println(Arrays
				.toString(new IntersectionOfTwoArrays().intersection(new int[] { 4,9,5 }, new int[] { 9,4,9,8,4 })));
	}

}
