import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(x / y);
            } catch (Exception e) {
                System.out.print(e.toString());
            }
        } catch (Exception e) {
            System.out.print("java.util.InputMismatchException");
        }

        sc.close();
    }
}
