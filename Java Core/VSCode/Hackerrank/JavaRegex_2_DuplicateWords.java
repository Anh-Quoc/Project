import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaRegex_2_DuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arrList = new ArrayList<>();
        while (n-- >= 0) {
            arrList.add(sc.nextLine());
        }

        for (String line : arrList) {
            String[] wordInLine = line.split(" ");

            HashMap<String, String> map = new HashMap<>();
            for (String word : wordInLine) {
                if (!map.containsKey(word.toLowerCase())) {
                    map.put(word.toLowerCase(), word);
                }
            }

            System.out.print(map);

        }
        sc.close();
    }
}
