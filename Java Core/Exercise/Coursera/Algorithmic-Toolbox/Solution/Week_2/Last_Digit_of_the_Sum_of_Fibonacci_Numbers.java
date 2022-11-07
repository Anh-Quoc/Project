import java.util.Scanner;

public class Last_Digit_of_the_Sum_of_Fibonacci_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.valueOf(sc.next());
        // F(n) = F(n+2) - F(n+1)
        // F(n-1) = F(n+1) - F(n)
        // . . .
        // . . .
        // . . .
        // F(1) = F(3) - F(2)
        // =>> F(1) + ... + F(n) = F(n + 2) - F(2)
        long lastDigitFibo = fibonacciModulo(n + 2, 10);
        if (lastDigitFibo < 1) {
            System.out.println(lastDigitFibo + 10 - 1);
        } else {
            System.out.println(lastDigitFibo - 1);
        }

        sc.close();
    }

    private static long fibonacciModulo(long n, long m) {
        long pisanoLength = getLengthPisano(m);
        n = n % pisanoLength;

        long prev = 0;
        long curr = 1;

        if (n <= 1) {
            return n;
        }
        for (long i = 0; i < n - 1; i++) {
            long temp = curr;
            curr = (prev + curr) % m;
            prev = temp;
        }
        return curr % m;
    }

    private static long getLengthPisano(long m) {
        long prev = 0;
        long curr = 1;
        long res = 0;

        for (long i = 0; i < m * m; ++i) {
            long temp = curr;
            curr = (prev + curr) % m;
            prev = temp;

            if (prev == 0 && curr == 1) {
                res = i + 1;
                break;
            }
        }
        return res;
    }
}
