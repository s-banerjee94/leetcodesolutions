import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stk = new ArrayDeque<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stk.isEmpty() && temperatures[stk.peekFirst()] < temperatures[i]) {
                int index = stk.pollFirst();
                ans[index] = i - index;
            }
            stk.offerFirst(i);
        }
        if (!stk.isEmpty()) {
            for (int ind : stk) {
                ans[stk.pollFirst()] = 0;
            }
        }
        return ans;
    }
}
