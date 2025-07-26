public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        int square = 0;

        while(left <= right) {
            int mid = left  + (right - left) / 2;
            if(mid <= num / mid) {
                square = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return square * square == num;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
