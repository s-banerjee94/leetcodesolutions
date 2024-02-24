package leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		int newNumber = 0;
		int oldNumber = x;
		while (oldNumber != 0) {
			int temp = oldNumber % 10;
			newNumber = newNumber * 10 + temp;
			oldNumber = oldNumber / 10;
		}
		return x == newNumber;
	}

	public static void main(String[] args) {
		System.out.println(new PalindromeNumber().isPalindrome(1211));
	}

}
