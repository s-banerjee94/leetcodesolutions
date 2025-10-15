public class AddBinary {
    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0 && a.charAt(i) == '1') ? 1 : 0;
            int bitB = (j >= 0 && b.charAt(j) == '1') ? 1 : 0;

            int sum = bitA + bitB + carry;
            carry = sum / 2;
            sb.append(sum % 2);

            i--;
            j--;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary solution = new AddBinary();
        System.out.println(solution.addBinary("1011", "1011"));
        System.out.println(solution.addBinary("11", "1"));
    }
}
