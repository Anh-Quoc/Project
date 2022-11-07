
import java.util.Scanner;

class MaximumValueOfTheLoot{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int wOfKnapsack = sc.nextInt();
		
		double[] listValue = new double[n];
		double[] listWeights = new double[n];
		double[] valueDivWeights = new double[n];

		for(int i = 0; i < n; ++i){
			listValue[i] = sc.nextDouble();
			listWeights[i] = sc.nextDouble();
			valueDivWeights[i] = (listValue[i] / listWeights[i]) * 10000.0;
			valueDivWeights[i] = Math.round(valueDivWeights[i]) / 10000.0;
		}



		// System.out.println(n + " " + wOfKnapsack);
		// for(int i = 0; i < n; ++i){
		// 	System.out.println(listValue[i] + " " + listWeights[i]);			
		// }

		for(int i = 0; i < n; ++i){
			System.out.println(valueDivWeights[i]);
		}

		sc.close();
	}
}