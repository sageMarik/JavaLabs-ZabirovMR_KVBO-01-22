import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
        }

        if (n <= 1) {
            System.out.println("Натуральное число должно быть больше 1.");
            return;
        }

        primeFactorization(n);
    }

    public static void primeFactorization(int n) {
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }
    }
}
