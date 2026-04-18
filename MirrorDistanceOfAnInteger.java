public class MirrorDistanceOfAnInteger {
	public int mirrorDistance(int n) {
		int rev = 0;
		int num = n;
		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n /= 10;
		}
		return Math.abs(num - rev);
	}

	public static void main(String[] args) {
		System.out.println(new MirrorDistanceOfAnInteger().mirrorDistance(25));
		System.out.println(new MirrorDistanceOfAnInteger().mirrorDistance(13));
	}
}
