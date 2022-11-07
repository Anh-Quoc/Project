import java.util.Scanner;

public class NganXepVaHangDoi_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String HeNhiPhan = "";
        while (n > 0) {
            HeNhiPhan = String.valueOf(n % 2) + HeNhiPhan;
            n /= 2;
        }
        System.out.println(HeNhiPhan);
        sc.close();
    }
}