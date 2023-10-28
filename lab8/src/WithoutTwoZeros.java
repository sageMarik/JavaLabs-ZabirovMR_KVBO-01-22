import java.util.Scanner;

public class WithoutTwoZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a < b - 1 || a > 2 * (b + 1)) {
            System.out.println(0);
        } else {
            long result = countSequences(a, b);
            System.out.println(result);
        }
    }

    public static long countSequences(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }

        long[][] dp = new long[a + 1][b + 1];
        dp[0][0] = 1;

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                }
                if (j > 0 && i < a) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }

        return dp[a][b];
    }
}
