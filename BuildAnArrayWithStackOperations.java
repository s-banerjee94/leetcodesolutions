import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int current = 1;
        for(int el : target) {
            while(current < el) {
                ans.add("Push");
                ans.add("Pop");
                current++;
            }
            ans.add("Push");
            current++;
        }
        return ans;
    }
}
