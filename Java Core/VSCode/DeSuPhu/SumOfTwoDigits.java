
import java.util.Scanner;

class SumOfTwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
	int a = sc.nextInt();
	System.out.print("b = ");
        int b = sc.nextInt();
	
        System.out.println(sumOf(a, b));
    }

    public static int sumOf(int a, int b){
	return a + b;
    }

}
