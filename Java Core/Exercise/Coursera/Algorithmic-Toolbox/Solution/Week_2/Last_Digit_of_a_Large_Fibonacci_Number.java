import java.util.Scanner;

class Last_Digit_of_a_Large_Fibonacci_Number {

    static long fibo(long number) {
        if (number <= 1) {
            return number;
        }
        long fibo_1 = 1;
        long fibo_2 = 1;
        long fibo_next = 1;
        for (int i = 3; i <= number; ++i) {
            fibo_next = (fibo_1 + fibo_2) % 10;
            fibo_1 = fibo_2 % 10;
            fibo_2 = fibo_next % 10;
        }
        return fibo_next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibo(n));
        sc.close();
    }
}