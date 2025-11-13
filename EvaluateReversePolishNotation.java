import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stk = new ArrayDeque<>();
        String op = "+-*/";
        for (String str : tokens) {
            if (op.contains(str)) {
                stk.offerFirst(calculate(stk.pop(), stk.pop(), str));
            } else {
                stk.offerFirst(Integer.parseInt(str));
            }
        }
        return stk.pop();
    }

    private int calculate(int a, int b, String op) {
        int result = 0;
        switch (op) {
            case "+":
                result = b + a;
                break;
                
            case "-":
                result = b - a;
                break;

            case "*":
                result = b * a;
                break;

            case "/":
                result = b / a;
                break;
        }
        return result;
    }

}
