package wk1;

import java.util.ArrayDeque;
import java.util.Deque;

class ValidParantheses {
    public boolean isValid(String s) {
        String open = "({[";
        String close = "]})";
        Deque<Character> stack = new ArrayDeque<>();

        char[] newS = s.toCharArray();

        for (char c : newS) {
            if (open.contains(String.valueOf(c))) {
                stack.push(c);
            } else if (close.contains(String.valueOf(c))) {
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

}