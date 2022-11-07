// import java.util.Scanner;

// class LargestNumber {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		String allNumber = "";
// 		for (int i = 0; i < n; ++i) {
// 			allNumber += String.valueOf(sc.nextInt());
// 		}

// 		String largestNumber = "";
// 		int digit = 9;
// 		while (!allNumber.isEmpty()) {
// 			String strDigit = String.valueOf(digit);
// 			while (allNumber.contains(strDigit)) {
// 				largestNumber += strDigit;

// 				allNumber = allNumber.substring(0, allNumber.indexOf(strDigit))
// 						+ allNumber.substring(allNumber.indexOf(strDigit) + 1);
// 			}
// 			--digit;
// 		}

// 		System.out.println(largestNumber);
// 		sc.close();
// 	}
// }