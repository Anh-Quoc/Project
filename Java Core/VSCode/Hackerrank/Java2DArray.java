import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        bufferedReader.close();

        // 1 1 1 0 0 0
        // 0 1 0 0 0 0
        // 1 1 1 0 0 0
        // 0 0 2 4 4 0
        // 0 0 0 2 0 0
        // 0 0 1 2 4 0

        int sumMax = Integer.MIN_VALUE;
        for (int i = 0; i + 2 < 6; ++i) {
            for (int j = 0; j + 2 < 6; ++j) {
                int sum = sumOf(i, j, arr);
                if (sum > sumMax) {
                    sumMax = sum;
                }
            }
        }
        System.out.print(sumMax);
    }

    public static int sumOf(int x, int y, List<List<Integer>> arr) {
        int sumAll = 0;
        for (int i = x; i <= x + 2; ++i) {
            for (int j = y; j <= y + 2; ++j) {
                sumAll += arr.get(i).get(j);
            }
        }
        return sumAll - arr.get(x + 1).get(y) - arr.get(x + 1).get(y + 2);
    }
}
