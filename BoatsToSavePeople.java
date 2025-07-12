import java.util.Arrays;

public class BoatsToSavePeople {
	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int left = 0;
		int right = people.length - 1;
		int boat = 0;
		while (left <= right) {
			if (people[left] + people[right] <= limit)
				left++;
			right--;
			boat++;
		}
		return boat;
	}

	public static void main(String[] args) {
		System.out.println(new BoatsToSavePeople().numRescueBoats(new int[] { 3, 5, 3, 4 }, 5));
	}
}
