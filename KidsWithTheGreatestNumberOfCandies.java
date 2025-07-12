import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> res = new ArrayList<>();

		int currentHeighestCandie = candies[0];
		for (int i = 1; i < candies.length; i++) {
			currentHeighestCandie = Math.max(currentHeighestCandie, candies[i]);
		}

		for (int candie : candies) {
			if (candie + extraCandies >= currentHeighestCandie) {
				res.add(true);
			} else {
				res.add(false);
			}
		}

		return res;
	}

	public static void main(String[] args) {
//		kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3);
		System.out.println(kidsWithCandies(new int[] { 2, 3, 5, 1, 3 }, 3));
	}
}
