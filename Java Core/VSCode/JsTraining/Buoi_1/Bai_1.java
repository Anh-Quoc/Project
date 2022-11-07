import java.util.*;

class Buoi_1_Bai_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		
		do{
		
			sum += number % 10;
			number /= 10;
		} while(number > 0);


		System.out.println(sum);
	}
}