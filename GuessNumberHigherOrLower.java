public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(guess(mid) == -1) {
                right = mid - 1;
            } else if (guess(mid) == 1) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return 0;
    }

    // proxy method
    public int guess(int num) {
        return 0;
    }

    public static void main(String[] args) {
        GuessNumberHigherOrLower solution = new GuessNumberHigherOrLower();
        int result = solution.guessNumber(10);
        System.out.println("The number is: " + result);
    }
}
