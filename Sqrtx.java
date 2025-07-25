public class Sqrtx {
    public int mySqrt(int x) {
        if(x == 0) return 0;

        int left = 1;
        int right = x;
        int result = 0;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(mid <= x / mid) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Sqrtx().mySqrt(4));
        System.out.println(new Sqrtx().mySqrt(8));
    }
}
