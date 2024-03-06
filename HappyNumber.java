package leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
        int squareSum = n;
        
        while (squareSum != 1) {
            int tempSquareSum = squareSum;
            squareSum = 0;
            
            while (tempSquareSum > 0) {
                int lastDigit = tempSquareSum % 10;
                squareSum += lastDigit * lastDigit;
                tempSquareSum /= 10;
            }
            
            if (!set.add(squareSum))
                return false;
        }
        
        return true;
	}

	public static void main(String[] args) {
		System.out.println(new HappyNumber().isHappy(61));
	}

}
