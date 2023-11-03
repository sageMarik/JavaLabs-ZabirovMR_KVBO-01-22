import java.util.Scanner;

public class Palindrome {
    public static <isPalindrome> void main(String[] args) {
        String word = "";
        try (Scanner scanner = new Scanner(System.in)) {
            word = scanner.next();
        }

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word) {
        return isPalindromeRecursive(word, 0, word.length() - 1);
    }

    public static boolean isPalindromeRecursive(String word, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }

        return isPalindromeRecursive(word, left + 1, right - 1);
    }
}
