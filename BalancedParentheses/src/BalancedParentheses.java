import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : expression.toCharArray()) {
            if (isOpenBracket(bracket)) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), bracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpenBracket(char bracket) {
        return bracket == '(' || bracket == '{' || bracket == '[';
    }

    private static boolean isMatchingPair(char openBracket, char closeBracket) {
        return (openBracket == '(' && closeBracket == ')') ||
                (openBracket == '{' && closeBracket == '}') ||
                (openBracket == '[' && closeBracket == ']');
    }
}