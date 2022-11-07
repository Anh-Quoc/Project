import java.util.*;

class NearestValue{
	public static void main(String[] args) {
		int[] arrInt = {-2, 0};
		int soughtValue = -1;

		System.out.println(nearestValue(arrInt, soughtValue));
	}
	static int nearestValue(int[] arrInt, int soughtValue){
		String arrString = Arrays.toString(arrInt);
		// arrString = [4, 9, -10, -10, -10]
		arrString = arrString.replace("[", "|");
		arrString = arrString.replace("]", "|");
		arrString = arrString.replaceAll(", ", "|");
		// arrString = |4|9|-10|-10|-10|
		int count = 0;
		while(true) {
			// Kiem tra soughtValue +- count co xuat hien trong chuoi hay khong
			// So nho nhat gan soughtValue nhat
			if(arrString.contains("|" + String.valueOf(soughtValue - count) + "|")){
				return soughtValue - count;				
			}
			// So gan soughtValue nhat 
			if(arrString.contains("|" + String.valueOf(soughtValue + count) + "|")){
				return soughtValue + count;
			}
			++count;
		}
	}
}
