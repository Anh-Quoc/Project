import java.util.Scanner;

class Assertion {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur age ");

        int value = sc.nextInt();
        assert value >= 18 : " Not valid";

        System.out.println("value is " + value);

        sc.close();
    }
}
