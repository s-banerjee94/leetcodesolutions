public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    // proxy method
    private static boolean isBadVersion(int mid) {
        return false;
    }

    public static void main(String[] args) {

    }
}
