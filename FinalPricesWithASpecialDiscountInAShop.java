import java.util.ArrayDeque;
import java.util.Deque;

public class FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] <= prices[st.peekFirst()]) {
                int index = st.pollFirst();
                ans[index] = prices[index] - prices[i];
            }
            st.offerFirst(i);
        }
        if (!st.isEmpty()) {
            for (int ind : st) {
                int index = st.pollFirst();
                ans[index] = prices[index];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FinalPricesWithASpecialDiscountInAShop solution = new FinalPricesWithASpecialDiscountInAShop();
        int[] prices = {8, 4, 6, 2, 3};
        int[] result = solution.finalPrices(prices);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
