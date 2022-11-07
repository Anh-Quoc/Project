import java.util.Scanner;

class MoneyChange{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		sc.close();


		int coins10 = value / 10;
		value %= 10;
		
		int coins5 = value / 5;
		value %= 5;

		int coins1 = value;

		System.out.println(coins10 + coins5 + coins1);
	}
}