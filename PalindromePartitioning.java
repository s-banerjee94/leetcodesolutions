import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> temp, List<List<String>> result) {
        if(start == s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i < s.length(); i++) {
            if(isPalin(s, start, i)) {
                temp.add(s.substring(start, i + 1));
                backtrack(s, i + 1, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }

    private boolean isPalin(String s, int start, int end) {
        while(start < end) {
            if(s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
