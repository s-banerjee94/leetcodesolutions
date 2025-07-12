import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
	public static List<String> fizzBuzz(int n) {
		int p = 1;
		List<String> reslut = new ArrayList<String>();
		while (p <= n) {
			if (p % 3 == 0 && p % 5 == 0)
				reslut.add("FizzBuzz");
			else if (p % 3 == 0)
				reslut.add("Fizz");
			else if (p % 5 == 0)
				reslut.add("Buzz");
			else
				reslut.add(String.valueOf(p));
			p++;
		}
		return reslut;
	}

	public static void main(String[] args) {
		System.out.println(fizzBuzz(5));
	}
}
