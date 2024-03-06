package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		int squarSum = n;
		while(squarSum != 1) {
			int tempSquarSum = squarSum;
			squarSum = 0;
			while(tempSquarSum > 0) {
				int lastDigit = tempSquarSum % 10;
				squarSum += Math.multiplyExact(lastDigit, lastDigit);
				tempSquarSum /= 10;
			}
			
			if(!set.add(squarSum))
				return false;
			
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new HappyNumber().isHappy(61));
	}

}
