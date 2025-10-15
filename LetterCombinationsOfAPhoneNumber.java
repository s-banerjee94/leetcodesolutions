import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> phoneMap = Map.of(
                '2', "abc",
                '3', "def",
                '4', "ghi",
                '5', "jkl",
                '6', "mno",
                '7', "pqrs",
                '8', "tuv",
                '9', "wxyz"
        );
        List<String> result = new ArrayList<>();
        backtrack(phoneMap, digits, new StringBuilder(), 0, result);
        return result;
    }

    private void backtrack(Map<Character, String> phoneMap, String digits, StringBuilder temp, int start, List<String> result) {
        if(start == digits.length()) {
            result.add(temp.toString());
            return;
        }

        char digit = digits.charAt(start);
        String letters = phoneMap.get(digit);


        for(char letter : letters.toCharArray()) {
            temp.append(letter);
            backtrack(phoneMap, digits, temp, start + 1, result);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
