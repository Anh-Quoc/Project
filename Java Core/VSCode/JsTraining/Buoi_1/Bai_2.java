import java.util.*;

class Bai_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int nGiaiThua = 1;
		do {
			System.out.print("Enter your number: ");
			n = sc.nextInt();
		} while(n <= 0 || n > 10);

		for(int i = 2; i <= n; ++i){
			nGiaiThua *= i;
		}

		System.out.println(nGiaiThua);
	}
}