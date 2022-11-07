import java.util.*;
import java.math.BigInteger;

class MaximumPairwiseProduct {
	static ArrayList<BigInteger> arr = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; ++i){
			arr.add(new BigInteger(sc.next()));
		}		
		Collections.sort(arr);
		BigInteger multiplyOf = arr.get(arr.size() - 1).multiply(arr.get(arr.size() - 2));
		System.out.println(multiplyOf);
	}
	
}