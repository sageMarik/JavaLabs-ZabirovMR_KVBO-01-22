public class Main {
    public static void main(String[] args) {
    String exp1 = "[()]{}{[()()]()}";
    String exp2 = "[(])";

    System.out.println(BalancedParentheses.isBalanced(exp1));  // Вывод: true
    System.out.println(BalancedParentheses.isBalanced(exp2));  // Вывод: false
}
}
