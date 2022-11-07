import java.util.*;
class SecondLargestNumber {
	public static void main(String[] args) {
		Integer[] arr = { -1, 0, -5, -6, -9, -8, -10, -9, -10};
		SortedSet<Integer> sortedArr = new TreeSet<>(Arrays.asList(arr));
		sortedArr.remove(sortedArr.last());
		System.out.println(sortedArr.last());
	}
}
