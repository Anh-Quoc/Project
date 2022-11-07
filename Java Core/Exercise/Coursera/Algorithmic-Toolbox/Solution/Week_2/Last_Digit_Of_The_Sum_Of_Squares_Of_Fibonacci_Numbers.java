import java.util.Scanner;

public class Last_Digit_Of_The_Sum_Of_Squares_Of_Fibonacci_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.valueOf(sc.nextLine());

        System.out.println((fibonacciModulo(n, 10) * fibonacciModulo(n + 1, 10)) % 10);
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
        for (int i = 0; i < n - 1; i++) {
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

        for (int i = 0; i < m * m; ++i) {
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
