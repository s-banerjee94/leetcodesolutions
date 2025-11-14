import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class ExclusiveTimeOfFunctions {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Deque<Integer> qu = new ArrayDeque<>();
        int prevTime = 0;
        for (String log : logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);
            if (type.equals("start")) {
                if (!qu.isEmpty()) {
                    ans[qu.peekFirst()] += time - prevTime;
                }
                qu.offerFirst(id);
                prevTime = time;
            } else {
                ans[qu.pollFirst()] += time - prevTime + 1;
                prevTime = time + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ExclusiveTimeOfFunctions solution = new ExclusiveTimeOfFunctions();
        int n = 2;
        List<String> logs = List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6");
        int[] ans = solution.exclusiveTime(n, logs);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
