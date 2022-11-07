import java.util.*;

class BiginningZeros{
	public static void main(String[] args) {
		String number = "";
		int firstIndexNumber = Integer.MAX_VALUE;
		for(int i = 1; i <= 9; ++i){
			int index = number.indexOf(String.valueOf(i));
			if(index >= 0 && index < firstIndexNumber){
				firstIndexNumber = index;
			}
		}		
		if(firstIndexNumber == Integer.MAX_VALUE){
			// Không có chữ số nào khác 0 trong chuỗi
			System.out.println(number.length());
		} else if(firstIndexNumber == 0){
			// Có chữ số khác 0 nằm ở đầu
			System.out.println("0");
		} else {
			// Có chữ số khác 0 nằm sau vị trí đầu tiên
			System.out.println(firstIndexNumber);
		}
	}
}