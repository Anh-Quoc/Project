import java.util.Scanner;

public class Last_Digit_of_the_Sum_of_Fibonacci_Numbers_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = Long.valueOf(sc.next());
        long n = Long.valueOf(sc.next());

        long lastDigit_Fibo_n = fibonacciModulo(n + 2, 10) - 1;
        long lastDigit_Fibo_m = fibonacciModulo(m + 1, 10) - 1;

        if (lastDigit_Fibo_n < lastDigit_Fibo_m) {
            System.out.println(lastDigit_Fibo_n + 10 - lastDigit_Fibo_m);
        } else {
            System.out.println(lastDigit_Fibo_n - lastDigit_Fibo_m);
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
